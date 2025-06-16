# Threads

> Definition
- It is seperate path of executing the group of statements
- It has its own stack and local variables
- They are light weight process and can share resources
- Thread contains [Thread Name, Thread Priority, Thread Group]

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
  - extends Thread class
  - implements Runnable interface
  - implements Callable interface
  - Executor service

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
