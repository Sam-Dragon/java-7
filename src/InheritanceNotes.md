# Inheritance

> Definition
- It is the oops feature which specifies the aquiring feature between classes
- It is signified with 'extends' (OR) 'implements' keyword
- It works well with the object level members
- It can access the features both from classes and interfaces
- We can inherit from abstract and instance methods not static, private or final
- protected access specifier works best with inheritance apart from default and public
- constructor inherit super classes with 'super' call
- class can extend only one class, whereas it can implement multiple interfaces
- interfaces can extend multiple interfaces

> Advantage
- Reusability

> Disadvantage
- Readability
- Code complexity increases

## Rules
1. inheritance must have same signature else it will be considered
2. Access level - child [overridden method] >= parent level
3. Checked Exception level - child [overridden method] <= parent level
4. Return Type - child [overridden method] <= parent level 

## Types
- Single Inheritance
- Multiple Inheritance

> Single Inheritance
- It is meant to access features from single class only
- It can be done using class extending class
- It is supported by java

> Multiple Inheritance
- It is meant to access features from multiple classes
- It can be done using class extending multiple class
- It is **not** supported by java
- Still, it can be solved via **interfaces**


## Constructor Chaining
-  It is the process of chaining the constructors in hierarchy from lower to higher which are under inheritance
-  It is done via 'super' call and implicitly done by compiler. Still we can declare if we want
-  In case, no class is under inheritance still super call will go to '**object**' class

## Super 
-  It is mainly used in case of inheritance to access members and chain constructors
-  It must be first line of the constructor but it can be anywhere in members
-  It can only fail incase the classes are under inheritance but parent constructor is **private**

## Protected 
-  It can be used to access the members of class within the package which acts like its own members
-  It can be used to access the members of class outside the package which acts like its private members

## Type Casting
-  It is process of changing the datatype
-  cast operator is used for performing type casting

> Types
- primitive datatypes: process of conversion between primitives and its object type
- reference datatypes: process of conversion between objects which are under inheritance

> Rule
- It is applicable for objects only if there are under inheritance
- In case of primitive types, they will convert between object and primitive type
- If programmer specify with cast operator for conversion then it must be handled properly as it is error prone, <pr>
  this process is called narrowing (OR) Explicit casting (OR) specialization

> Widening vs Narrowing
- Widening is the process of promoting the object to higher types & is done by compiler. Example - int i = 100;
- Narrowing is the process of demoting the object to lower types & is done by user explicitly. Example - int i = (int) 100.12;

> Implicit vs Explicit Casting
- Automatic casting done by compiler is called implicit casting, 
Explicit casting done by the user is called explicit casting
- Explicit casting is error prone where as implicit is not

> Generalization vs Specialization
-  Generalization is the process of promoting the classes to higher types
- specialization is the process of promoting the classes to lower types providiing specific functionality
