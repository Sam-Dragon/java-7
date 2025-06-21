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

> Methods
- currentThread() - gives details of thread
- start() - starts a new thread execution
- run() - internal method for thread execution which contains business logic
- sleep(int millis) - used to pause the execution of a thread for a specified duration. <br>
  It doesnt release any lock hold by thread
- setName(String name) & getName() - set the custom thread name & gets the custom thread name
- stop() - stopping the thread abnormally [NOT RECOMMENDED]

> Object Methods
- wait(int mills)
- notify()
- notifyAll()

> Rule
- Thread once started cannot be started again else it will give exception [InterruptedException]
- In multi-threaded environment, make sure exception handling is properly done
- Use timeout to unblock the threads

> Use cases
- Image/video processing
- Scientific simulations
- Cryptographic calculations
- Machine learning model training
- Data compression/encryption

## Thread Priority
- It speicifies the thread execution based on priority
- It varies from 1 to 10, 10 being the highest. Default is 5
- It helps jvm to pick the threads and execute accordingly

## Thread Group
- Every thread is assigned to a group. Each group can contain many threads
- Thread groups helps to specify how many threads are allocated for an operation

> Good Practice
- Always customize the thread name so it is useful during debugging
- Make sure threads count must be equal to cores, beyond this abrupt behavior can be expected
- Use standard frameworks to avoid basic issues w.r.t threads as it reduces probability of issues
- Timeouts and finally block is used for unhookinh a thread
