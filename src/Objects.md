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
  - wait() - used for locking the object till it is unlocked by nofity() or notifyAll()
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

> Rule
- use default clone() method

### Deep Cloning
- It is the process of copying the object, modifications are **rejected** between cloned and actual object
- It can be done by copying content into completely new object. custom implementation is required
- It requires more memory, slower, create new copies of references, independent of actual object

> Rule
- use clone() method and provide custom implementation [always create new object]
