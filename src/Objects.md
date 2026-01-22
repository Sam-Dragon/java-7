# Object

> Definition

- It is the root of the java programming
- It is the instance of the class
- It contains members [variables and methods] & constructors
- All the variables associated to object are called instance variables and they will set to default
- All the members associated to object are called instance methods
- Inheritance is allowed only on instances hence we can perform method overriding

> Rule

- To create an object, make sure class is accessible
- Constructors cannot be private in nature

> Creation

- It can be created multiple ways
    - Using 'new' keyword
    - Factory classes
    - Cloning
    - Reflection
    - Class.forName()

> Methods

- It contains several very **IMPORTANT** methods
    - equals() - used for matching the content of objects
    - hashcode() - generated unique hexadecimal number as reference
    - wait() - used for locking the object till it is unlocked by notify() or notifyAll()
    - notify() - used for unlocking the object by sending signal to object
    - notifyAll() - used for unlocking the objects by sending signal to objects
    - clone() - used for cloning the objects
    - finalize() - used for garbage collection
    - toString() - convert object to string

## Cloning

- It the process of creating an object by copying its contents
- It can be applied using '**cloneable**' interface & overriding clone() method
    - cloneable is marker interface, the means it has no methods
    - clone() is object method and can be used to specify cloning strategies

> Advantage

- Reusability

> Types

- Shallow Cloning
- Deep Cloning

### Shallow Cloning

- It is the process of copying the object, modifications are **accepted** between cloned and actual object
- It can be done by using default clone method
- It requires less memory, faster, copies references, dependent on actual object
- It is useful when nested objects are immutable and increase performance
- Not recommended for multithreaded application as it has mutable state

> Rule

- use default clone() method and calls super method

### Deep Cloning

- It is the process of copying the object, modifications are **rejected** between cloned and actual object
- It can be done by copying content into completely new object. custom implementation is required
- It requires more memory, slower, create new copies of references, independent of actual object
- It requires clone() method to be **explicitly** handled all the other classes used
- It is useful in multithreaded code and also in DTOs, caching, messaging

> Rule

- use clone() method for main object and provide custom implementation for clone method parent and other classes
  used [always create new object]

~ NOTE: To avoid cloning problems, we can use copy constructor, factory methods, DTO Mapping and best is immutable
objects

## equals() & hashcode() contract

- If two objects are equal using equals() method, then there hashcode() must be same
- If two objects are not equal using equals() method, then there hashcode() can be same or different

## Hash Collision

- It is the scenario which happens due to poor hashcode implementation
- It can be simply tested by generation same hash value for all the objects
- It can be resolved by generation unique and long hash value using hash function
