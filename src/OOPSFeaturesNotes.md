# OOPS Features 
- Root of all class is Object class

## Encapsulation
- Wrapping of the fields and its associated methods into a single unit <br>
Example: class

> Steps to achieve it
1. Mark the variables as private
2. Make the methods as public
3. Expose setter and getter methods
   - for boolean data-types, getter methods can be specified is 'IS' prefix

> Advantages
- Flexibility. 
- Maintainability. 
- Extensibility. Code can be extendable. i.e Validation can be added later
- Prevents overwriting of code
- Same variables can be used in different class


## Abstraction
- It is one level above encapsulation, in simple terms it controls whats needs to be displayed
- Hiding the implementation details 
- It say 'What to implement' not 'how to implement'

> Steps to achieve it
- It can be achieved by INTERFACE where you must specify abstract methods
- It can also be achieved by ABSTRACT CLASS where you must specify abstract methods
- It can also be achieved in same class but exposing only required members through a method

> Advantages
- Caller of the class must forcibly define its own implementation


## Inheritance
- Accessing the features of one class by another
- It can be done in two ways 'IS-A' & 'HAS-A' relationship

> Steps to achieve 'IS-A' relationship 
1. Class can only 'extend' another class
2. Class can implement any number of interface
3. Interface can only 'extend' another interface

> Steps to achieve 'HAS-A' relationship
1. Class must contains the reference of another class in form of variable

> Advantages
- Re-usability
- Polymorphism


## Polymorphism
- It works only on instance methods
- Method with same name but different signatures
- It can be achieved by 
	- STATIC POLYMORPHISM  --> WITH STATIC, FINAL & PRIVATE methods
	- DYNAMIC POLYMORPHISM --> METHOD OVERRIDING & METHOD OVERLOADING

> Steps to achieve method overloading
1. Create two methods with different arguments in same class
2. Create two class under inheritance but the methods must be same but difference in arguments

> Steps to achieve method overriding
1. Create two class with same method
2. Make sure the classes are under inheritance [extends]
3. Sub Class must be override the Super class method

> Advantages
- Re-usability
- Flexibility
