# Non Access Modifiers

## Class

1. Class can be abstract, final but not static
2. Final classes cannot be inherited [extends], it can only be instantiated
   - It prevents extensibility but useful in designing LIBRARIES
   - All the variables can be marked as final including local variable
   - All the methods can be marked as final except abstract
   Ex - Thread, String class etc..
3. Final Methods cannot be overridden
4. Final Variables cannot be updated

1. Abstract classes cannot be instantiated, it can only be inherited [extends]
   - class can be marked abstract without having even single abstract method
   - if class contains one abstract method, then class is forced to be marked as ABSTRACT
2. Abstract method is about definition [i.e. it doesn't contain method body]
   - abstract method cannot be combined with STATIC nor FINAL
3. Variables cannot be marked as abstract

1. Class cannot be marked as synchronized
2. Methods can be marked as Synchronized 
2. Variables cannot be marked as synchronized
4. It can be used with any combination with access modifiers
5. Synchronized keyword specially used w.r.t threads for concurrency problem

1. Class cannot be marked as native
2. Methods can be marked as native
2. Variables cannot be marked as native
4. It can be used with any combination with access modifiers except strcitfp
5. native keyword states platform dependent code like in C
6. method must be like abstract method

1. Class can be marked as strictfp
2. Methods can be marked as strictfp
2. Variables cannot be marked as strictfp
4. It can be used with any combination with access modifiers except strcitfp
5. strictfp keyword states strict floating point IEEE standard platform 

Note : Never use combination such as ABSTRACT FINAL, ABSTRACT STATIC, PRIVATE ABSTRACT,
ABSTRACT SYNCHRONIZED, NATIVE SYNCHRONIZED

#. To verify the access, follow the below steps

1. Check Class level access

## Final Class
- If the class is default final, then any class of same package can access it members 
[Methods & Variables] only by instance not via inheritance
- If the class is public final, then any class of different package can access it members 
[Methods & Variables] only by instance not via inheritance

> Final Methods
- If the method is declared as final, it cannot be overridden

> Final Variables
- If the variable is declared as final, it cannot be updated


## Abstract Class
- If the class is default abstract, then any class of same package can access it members 
[Methods & Variables] only via inheritance not by instance 
- If the class is public abstract, then any class of different package can access it members 
[Methods & Variables] only via inheritance not by instance
- It needs to be marked with 'abstract' keyword
- No memory will be allocated for abstract class
- It can contain both abstract and non-abstract methods
- It can be marked abstract even if there are 0 or more abstract methods
- We can have any number of abstract and non-abstract methods
- abstract doesnt work with final
- We cannot create object of abstract class but it is utilized through anonymous class
- **'protected' variables** works well with abstract class
- Example: Bill interest calculation for domestic and commercial purpose

> Rule
- If there is even single abstract method in class, then class must be marked as abstract
- Method overridden of abstract class must happen when first concrete class inherits from it
- Abstract class must be accessed only via inheritance 

> Advantage
- It provides Extensibility
- It must be used specially when there are some common features between classes

> Abstract Methods
- If the method is declared as abstract, it needs to be overridden
- It needs to be implemented if the class is non-abstract else not necessary
- It doesnt have method body, just it declares method signature
- abstract doesnt work with static & final

> Abstract Variables
- Variables cannot be marked as abstract

# Inner Class
- It is always used inside another class
- It will be represented as 'this$0' if one inner class is defined
- To access inner class variables, methods we can you 'this.'
- To access current class variables, methods we can you 'classname.this'
- Inner class are useful, when we want specific guys to update
