# Threads

> Definition
- It is seperate path of executing the group of statements
- It has its own stack and local variables
- They are light weight process and can share resources
- Thread contains [Thread Name, Thread Priority, Thread Group]
- **main thread** is the default thread run by main method of java program & managed by jvm
- common exception thrown by threads is **InterruptedException**
- Threads execution can be both synchronous and asynchronous

> Advantages
- useful in utilizing cores and provides faster execution
- resource sharing
- concurrency

> Disadvantages
- increase code complexity
- resource overhead
- deadlocks
- synchronization issues

> Creation
- It can be created in following ways
  - extends Thread class [NOT RECOMMENDED]
  - implements Runnable interface [RECOMMENDED]
  - implements Callable interface [RECOMMENDED]
  - Executor service [RECOMMENDED] 

  ### Thread Class 
  - It is used for creating a thread object by directly extend to it
  - It limits base class to extend futher more
  - It doesnt return anything
 
  ### Runnable Interface 
  - It is used for creating a thread object by providing implementation for it
  - It allows class to extend further
  - As it is an interface, we need to create object of it and pass to thread instance as argument
  - It doesnt return anything
 
  ### Callable Interface 
  - It is used for creating a thread object by providing implementation for it
  - It allows class to extend further
  - As it is an interface, we need to create object of it and pass to thread instance as argument
  - It is useful in return values or future result
  - It will use java "Future" or "FutureTask" for retriving results
 
  ### Executor Service
  - It already has working threads and we need to pass implmentation to it via Runnable or Callable
  - It is useful in return values or future result for callable
  - It will use java "Future" or "FutureTask" for retriving results for callable 

> Termination
- It can be done via stop() method but is "**Deprecated**"
- Now the safe way to do this is by using a stop flag which is boolean
- We can also do using Thread.interrupt().isInterrupted() flag

> Methods
- currentThread() - gives details of thread
- start() - starts a new thread execution
- run() - internal method for thread execution which contains business logic
- sleep(int millis) - used to pause the execution of a thread for a specified duration. <br>
  It doesnt release any lock hold by thread
- setName(String name) & getName() - set the custom thread name & gets the custom thread name
- stop() - stopping the thread abnormally [NOT RECOMMENDED]
- join() - joins the thread allowing squencial execution

> Object Methods
- wait(int mills) - waits for notification which is expected from notify or notifyAll()
- notify() - wakes up single thread
- notifyAll() - wakes up all the threads

> Notes
- Thread once started cannot be started again else it will give exception [InterruptedException]

> Use cases
- Image/video processing
- Scientific simulations
- Cryptographic calculations
- Machine learning model training
- Data compression/encryption

## Thread Priorities
- When the jvm scheduler runs, it will execute threads based on priority  
- It speicifies the thread execution based on priority
- It varies from 1 to 10, 10 being the highest. Default is 5
- It helps jvm to pick the threads and execute accordingly

## Thread Group
- Every thread is assigned to a group. Each group can contain many threads
- Thread groups helps to specify how many threads are allocated for an operation
- Each thread works on independent task
- Threads in group doesnt require any communication
- It consumes more memory and can result in crashes

## Thread Pool
- It is the concept which creates a pool of working threads
- It contains limited number of threads and will be reused in pool
- It requires communication between threads for task execution
- It consumes less memory as it has fixed set of threads & are reused
- It is the effective way of using threads for tasks

### Types of Pools
- There are five types of pools which can be used
  - Single Thread Executor: It just contains only one thread & executes task sequencially. Example - Any Program
  - Single Thread Scheduled Thread pool: It contains only one Thread & useful for scheduling future tasks. Example - Payment
  - Fixed Thread Pool:  It contains fixed number of threads and executes tasks parallely
  - Cached Thread Pool: It contains multiple threads provided and executes tasks and waits till 1min before thrashing and                            then new threads will be created
  - Schedule Thread Pool: It contains multiple threads provided and executes future tasks and waits till 1min before                                   thrashing and then new threads will be created

## Synchronization
- It is the process in which single thread will be allowed to executed a task by aquiring lock in multi-threaded environment
- It degrades performance as all threads will wait for lock
- It can be done via synchronous block (OR) via synchronous method

> Synchronous Block
- It is used to synchronize the object inside the method, allowing some control statments to execute
- It is preferred as thread can perform some statments execution in multi-threaded environment
- It is provided with sync(Object obj) { .... }

> Synchronous Method
- It is used to synchronize the object declared at method level
- It is not preferred as threads needs to wait for lock 
- It is provided with public synchronized void method (Object obj) { .... }
- They are used in collections method such as Collections.synchronizedList(collection),   Collections.synchronizedSet(collection), Collections.synchronizedMap(collection)

## Locks
- It is used by the thread for aquiring the object to perform some operations
- It can be done using synchronization blocks (OR) synchronization methods

### Types
> Intrinsic Locks
- Implicit locks which works with single thread under synchronization <br>
    - Object level lock : lock which works on object instance <br>
    - Class level lock : lock which works on class instance <br>

> Explicit Locks
- Explicit locks which doesnt need synchronization but is alternative to it
    - ReentrantLock : It provides features like fairness policies, interruptible lock acquisition, and the ability to try                         acquiring a lock with a timeout. It is "reentrant" meaning the thread holding the lock can re-acquire                       it without causing a deadlock.
    - ReadWriteLock : It interface provides separate locks for reading and writing. Multiple threads can acquire the read                         lock concurrently but only one thread can aquire write lock
    - StampedLock   : Introduced in Java 8, StampedLock offers three modes: writing, reading, and optimistic reading. It                          provides a more fine-grained control over locking and can offer better performance in read-heavy                            scenarios compared to ReadWriteLock by allowing optimistic reads that don't block writers<br>

> Synchronization Aids
- While not strictly "locks" in the same sense as the above, these mechanisms also help manage                                concurrency
    - Semaphore: A signaling mechanism that controls access to a limited number of resources. It maintains a count of                        available permits, and threads acquire a permit to access the resource and release it when done.
    - CountDownLatch: A synchronization aid that allows one or more threads to wait until a set of operations being                               performed in other threads completes. It works like a gate that remains closed until a counter                              reaches zero.
    - Cyclic Barrier: A synchronization aid that allows one or more threads to wait until a set of operations being                               performed in other threads completes. similar to countdown latch but threads are reusable.

> Good Practice
- Always customize the thread name so it is useful during debugging
- Make sure threads count must be equal to cores, beyond this abrupt behavior can be expected
- Use standard frameworks to avoid basic issues w.r.t threads as it reduces probability of issues
- Timeouts and finally block is used for unhookinh a thread

## Deadlock
- Deadlock is a process in which threads lock each other waiting forever, it happens in mutli-threaded enviroment while threads works with resource with sync block or methods <br>
- It can occur if the two threads waits for each other to release the resource <br>
> Steps: 
- Its generally happens through bad design, it can be corrected at code level
- Avoid nested locks, unncessary locks & also from thread.join() method <br>
> Disadvantages: 
- It can run the memory out
- system will hang and slowness can be observed

## Thread Communication
- It is process in which threads communicate with each other
- It uses wait(), notify() and notifyAll() methods of object
- It must be used under **synchronization**
- It must have **shared resource** for processing
- It is example of producer-consumer problem

> Rule
- Ensure the code is **synchronized**
- Ensure there must be shared object or resource

## Daemon Threads
- Threads which are not created by user and runs forever. [system threads]
- They are useful for running background process. lets say - updating service package, database service
- isDeamon() of thread method helps in indicating whether it is normal or deamon thread

## Thread Life Cycle
- New - When the thread is created but not running state [start() method] 
- Runnable - When the thread is ready to run [yeild(), notify(), notifyAll() method]
- Not-Runnable - When the thread is blocked/waited [sleep(), wait(), IO Block method] 
- Terminate - When the thread is killed [stop() method (OR) run method finishes] 

## Best Practices
- Try to use executor service for thread based programs
- All the executions must have proper exception handling done
- Try to put timeouts for each operations to avoid long waiting or deadlocks
- Avoid direct synchronization of object rather look for alternatives
