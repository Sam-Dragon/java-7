# STRING

> Difference b/w String And String Builder Or String Buffer ?

- String are immutable objects whereas String builder / Buffer are mutable
- String methods needs to be referenced for modification whereas String builder / builder doesn't need as it updates
  internally
- String consumes more memory because literal will stay in memory whereas String Builder / buffer doesn't as string
  object keeps updating
- String doesn't support useful methods such as insert, delete etc.. whereas String builder / buffer supports the same

> Difference b/w String Builder And String Buffer

- String Builder is single threaded whereas String Buffer is multi-threaded
- String Builder performance is high whereas String Buffer is low as methods are synchronized
- String Builder methods are NOT synchronized in nature whereas String Buffer method are synchronized

> Difference b/w String constant pool & Heap ?

- It is special memory of heap which stores the string objects which are unique whereas for heap it creates objects
  without any uniqueness
- Any string object is checked against string constant pool if created as literal whereas for heap it will create
  object every time
- String objects in pool wont be destroyed whereas string objects will be garbage collected post usage

> Method Overloading vs Method Overriding

- Method overloading must have different arguments whereas Method overriding must have same arguments list
- Method overloading is meant for code refinement whereas Method overriding is meant for code replacement
- Method overloading can have same or different of return type whereas Method overriding is must have same return
  type [Except for Covariant returns]
- Method overloading can have same or different of exceptions whereas Method overriding is must have same
  exceptions
- Method overloading can have same or different of access whereas Method overriding is must have same access
- Method overloading can be done in same or different class whereas Method overriding is must be done in different
  class
- JVM decides which method to pick depending on difference in method signature whereas for method overriding, JVM
  decides based on the object called
- Method overloading provides programmer a way to extend the already available feature whereas Method overriding
  provides programmer to provide different functionality for same feature

> Thread Group Vs Thread Pool

- Thread group just adds the thread to the based but that state can be anything whereas thread pool will contain fixed
  number of worker threads
- Thread group can task from different groups whereas thread pool will run tasks from thread pool
- Thread group No limitation on adding additional threads whereas thread pool has limited once fixed
- Thread group has overheads due to start and end of threads whereas thread pool has doesn't as they are managed by pool