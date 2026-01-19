# Class

> Definition

- It is template used for representing the object. It contains members [variables, methods] and constructors
- It is blueprint of the object
- For access modifiers, parent classes can be marked public and default but not protected and private
    - private classes can be defined as 'inner class' along with public and default
- For non access modifiers, parent classes can be marked abstract, final, strictfp but not static
    - static classes can be defined as 'inner class' along with abstract, final
- They are stored on heap area

> Members classified

- Access Modifiers - public, protected, private, default
- Non Access Modifiers - abstract, final, static, strictfp

> Instance Methods

- It can be accessed via object or via inheritance
- It can be invoked via object reference
- Example: setters & getters

> Instance Variables

- It can be accessed via object or via inheritance
- It will be set to defaults on object creation

> Constructors

- It can be invoked by default, else needs to be invoked if parameterized
- In case constructor is not declared, compiler will create one for the class

<br>

# Access Modifiers

- It is applicable on class, methods, variables and **constructor**

## Public Class

- If the class is marked as public, it is accessible within and outside the package

> Rule [Members]

- If the class is public and members are public, then any class of same or different package can
  access it members [Methods & Variables] either by instance or via inheritance

- If the class is public and members are private, then any class of same or different package
  cannot access it members [Methods & Variables] neither by instance nor via inheritance

- If the class is public and members are default, then any class of same package
  can access it members [Methods & Variables] either by instance or via inheritance
  [** Different package cannot access members]

- If the class is public and members are protected, then any class of same package
  can access it members [Methods & Variables] either by instance or via inheritance
- If the class is public and members are protected, then any class of different package
  can access it members [Methods & Variables] via inheritance not by instance

> Rule [Constructors]

- If the class is public and constructor is public, It can be accessed within or outside the package
- If the class is public and constructor is default, It can be accessed from within the package only

## Default Class

- All the class by default are marked as default class

> Rule [Members]

- If the class is default and members are public, then any class of same package can
  access it members [Methods & Variables] either by instance or via inheritance
  [** Different package cannot access members]

- If the class is default and members are private, then any class of same or different package
  cannot access it members [Methods & Variables] neither by instance nor via inheritance

- If the class is default and members are default, then any class of same package
  can access it members [Methods & Variables] either by instance or via inheritance
  [** Different package cannot access members]

- If the class is default and members are protected, then any class of same package
  can access it members [Methods & Variables] either by instance or via inheritance
  [** Different package cannot access members]

> Rule [Constructors]

- If the class is default and constructor is public, It can be accessed within the package only
- If the class is default and constructor is default, It can be accessed within the package only

## Protected Class

- We cannot make any parent class directly as 'protected' but it is possible to create using **inner classes**

> Rule [Members]

- If the class is public / default and members are protected, then any class of same package or different package
  can access it members [Methods & Variables] either by instance [same package] or via inheritance

> Rule [Constructors]

- If the class is public and constructor is protected, It can be accessed within the package only
- If the class is default and constructor is protected, It can be accessed within the package only

## Private Class

- We cannot make any parent class directly as 'private' but it is possible to create using **inner classes**

> Rule [Members]

- If the class is public / default and members are private, then any class of same package or different package
  cannot access it members [Methods & Variables] neither by instance nor via inheritance

> Rule [Constructors]

- If the class is public and constructor is private, It can be accessed within the class only
- If the class is default and constructor is private, It can be accessed within the class only

<br>

# Non Access Modifiers

- It is applicable on class, methods, variables but not on **constructor**

## Final Class

- Any class marked as final, then its members can be accessed only by instance not via inheritance
- It is thread-safe in nature
- It is mainly useful in creating utility / library class
- It needs to be marked with 'final' keyword
- It cannot have abstract members but can have static members
- final doesn't work with abstract
- **'protected' variables** works well with final, it is equivalent to 'default'

> Advantage

- It provides security
- It can be shred over the network as it is immutable in nature

> Final Methods

- If the method is declared as final, it cannot be overridden
- final doesn't work with abstract but can work with static

> Final Variables

- If the variable is declared as final, it cannot be updated
- It can be declared as constants useful for defining environment variables

## Abstract Class

- If the class is abstract, then its members can be accessed only via inheritance not by instance
- It needs to be marked with 'abstract' keyword
- No memory will be allocated for abstract class
- It can contain both abstract and non-abstract methods [instance methods]
- It can be marked abstract even if there are 0 or more abstract methods
- We can have any number of abstract and non-abstract methods [instance methods]
- abstract doesn't work with final
- We cannot create object of abstract class, but it is utilized through anonymous class
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
- It doesn't have method body, just it declares method signature
- abstract doesn't work with static & final

> Abstract Variables

- Variables cannot be marked as abstract

## Static Class

- Parent class cannot be marked as static class
- Only inner class can create static class
- They are stored on method area

> Static Methods

- It can be accessed via Class name
- If the method is declared as static, it cannot be overridden
- It can only access static variables
- It doesn't work with abstract but works with final

> Static Variables

- It can be accessed via Class name
- If the variables is declared as static, it is globally accessible [in combination with public]
- Mainly used for setting environment variables

## Inner Class

- It is always used inside another class
- It will be represented as 'this$0' if one inner class is defined
- To access inner class variables, methods we can you 'this.'
- To access current class variables, methods we can you 'classname.this'
- Inner class are useful, when we want specific guys to update
- It will define similar to class
- Its lifecycle depends on parent class

## Anonymous Inner Class

- It doesn't have any name
- It is created along with other class instantiation
- Its lifecycle depends on parent class
