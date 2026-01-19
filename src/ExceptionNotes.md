# Exception

> Definition

- It is abnormal condition which alters the flow of execution
- Every main method maintains has exception handling which are handled by JVM
- It is jvm object which is present in java.lang
- As a developer, we catch both compile time and runtime exceptions not errors
- parent of all exceptions and error is **Throwable** class
- Exception method calls are maintained in the stack thread & it will unwind when exception occurs

> Exception Classification

- JVM Exceptions
    - Any exceptions handled by JVM i.e. NullPointerException
- Programmatic Exceptions
    - Any exceptions handled by programmer i.e. FileNotFoundException

## Hierarchy

							 Object
							    |
							Throwable (C)
								|
				 _______________________________|_________________________________
				|								  |
			 Error (Runtime)					  		  Exception
			    (JVM)							 ____________|__________
				    						|			            |
				    					Checked Exception    	Runtime Exception
									      (compiler)		          (Jvm)

> Types

- Checked Exception [Compile Time]
    - The exception which are identified by the compiler at compile time
    - Ex : FileNotException, IOException
- Unchecked Exception [Run Time]
    - The exception which are identified by the JVM at run time
    - Ex : NullPointerException, ClassNotFound

> Creation

- it can be done using new keyword

> Methods

- printStackTrace() - print the stack trace for the exception
- getMessage()        - textual information about the exception
- e - specifies the exception details

## Exception Handling [Handle or Care for Checked Exceptions]

- It can be done with keywords like try, catch & finally
    - try {}     : indicates the block where chances of exceptions is there
    - catch(E e) { } : block specifies the actual exception details
    - finally {}     : block meant for closing of resources such as db connection closing, file closing

> Rule

- try can be followed by either by catch block or by finally or by none [try-with-resources]
- try can be followed by multiple catch blocks but only one finally block
- catch block can handle multiple exceptions types but from lower to higher order else compiler error

## try-with-resouces

- It is special edition which is useful in closing of resources instead of finally such as file reader closing, scanner
  closing
- It implements AUTO-CLOSABLE interface which manages calling close() method

## throw

- It is a keyword used for exception mechanism
- It throws only single exception, can be custom exception as well
- throwing an exception inside try block will be caught in catch block
- throwing an exception inside catch / finally block enforces throws clause at method level
- It can throw 'new' exception [custom as well] or can re-throw a exception or error as well
- Any code below throw will be **unreachable code**

## throws [Exception Declaration]

- It is basically ducking or passing of exception
- It is a keyword used for exception mechanism
- It can define multiple exceptions
- It will be used in method level only
- It can throw any exception compiled or runtime or even error

## Re-throwing an exception

- throwing an exception inside try {} will be caught in catch block & if same exception is thrown
  in the catch block, then it is called re-throwing an exception
- It wont be useful, unless we dont pass some necessary information along with exception object

## Custom Exception

- Extending to the Exception class
- specify the constructors with arguments else we can't use them

## finally block

- It will execute even if exception is thrown or result is returned
- finally block wont executed
    - if system.exit(0) is called
    - let thread sleep for very long period
    - by making recursive call

## Exception Propagation

- It is the process of ducking the exception or passing the exception or propagating the exception
- It can be achieved using throws clause
- Ducking : It is a process of not handling the exception rather passing it

## Exception Matching

- It the process of finding the exact match of exception if present else relative match  <br>
  i.e. from top to bottom catch block
- Hierarchy: DivideByZeroException -> ArithmeticException -> RuntimeException

## Rules

- Don't leave catch empty
- If user re-throw an exception, then don't use try and catch block
- We cannot write anything between try-catch-finally blocks
- Child Exception cannot be greater than parent exception. It can be equal or less than that
- We can create multiple exceptions using ('|') symbol but exceptions must not be in hierarchy
- It is always good to catch known exceptions followed by generic exception 
