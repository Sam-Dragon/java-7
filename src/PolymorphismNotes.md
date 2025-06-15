# Polymorphism
- It works only on instance methods
- Method with same name but different signatures
- It can be achieved by 
	- STATIC POLYMORPHISM  - STATIC, PRIVATE & FINAL METHODS for METHOD OVERRDING & OVERLOADING
	- DYNAMIC POLYMORPHISM - METHOD OVERRIDING & METHOD OVERLOADING

## STATIC POLYMORPHISM [STATIC BINDING]
- Method call to method body linking happens at compile time
- Method to execute is known to compiler at compile time
- It can be achieved by using method overloading

### Method Overloading
- Method with same name but with different arguments
- Difference in arguments could be based on Number of arguments, Order of arguments (OR)
Data type of arguments
- Method can have same or different return type (OR) access specifier (OR) exceptions
- Its applicable within the class only
 
> Rules
1. Method names must be same but arguments must be vary either by number of arguments (OR) 
by datatype of the arguments (OR) by order of the arguments

> Steps to achieve method overloading
1. Create two methods with different arguments in same class
2. Create two class under inheritance but the methods must be same but difference in arguments

> Advantages
- Extensibility

## Polymorphism with STATIC METHODS 
- If classes defines methods which are static in nature, compiler knows which method to execute <br>
- It is applicable if the method is overloaded

## Polymorphism with PRIVATE METHODS 
- If classes defines methods which are private in nature, compiler knows which method to execute
as parent method is private, then only child method can be executed. 
- It is applicable if the method is overloaded

## Polymorphism with FINAL METHODS 
- If classes defines methods final in nature, compiler knows which method to execute
as parent method is public, & child method is final, depending on object method will execute.
- It is applicable if the method is overloaded <br><br>


## DYNAMIC POLYMORPHISM [DYNAMIC BINDING]
- Method call to method body linking happens at runtime
- Method to execute is known to JVM at runtime
- Its applicable between the classes which are under **inheritance**

> Steps to achieve method overriding
1. Create two class with same method
2. Make sure the classes are under inheritance [extends]
3. Sub Class must be override the Super class method

> Advantages
- Re-usability, Flexibility

### Method Overriding
- Method with same name but with different signatures
- @Override is marker annotation which ensures the overridden method signature is same
even if you don't specify this annotation, method overriding still works

> Rules
1. Method overriding must have same signature else it will be become overloaded method
2. Access level - child [overridden method] >= parent level
3. Checked Exception level - child [overridden method] <= parent level
4. Return Type - child [overridden method] <= parent level 


## Tricky 
- If the wrapper class is used in method with single arguments like Integer, Long etc.. 
then passing null to argument result in compiler error because null is common for wrapper class
- Method accepting double arguments can be passed with direct values without specifying any type 
like 0D, 0d still it works unless there is no method accepting integer argument
