# Non Access Modifiers

## Class

1. Class can be abstract, final but not static
2. Final classes cannot be inherited [extends], it can only be instantiated
    - It prevents extensibility but useful in designing LIBRARIES
    - All the variables can be marked as final including local variable
    - All the methods can be marked as final except abstract
      Ex - Thread, String class etc.
3. Final Methods cannot be overridden
4. Final Variables cannot be updated

> Abstract Class

1. classes cannot be instantiated, it can only be inherited [extends]
    - class can be marked abstract without having even single abstract method
    - if class contains one abstract method, then class is forced to be marked as ABSTRACT
2. Abstract method is about definition [i.e. it doesn't contain method body]
    - abstract method cannot be combined with STATIC nor FINAL
3. Variables cannot be marked as abstract

> Synchronized

1. Class cannot be marked as synchronized
2. Methods can be marked as Synchronized
3. Variables cannot be marked as synchronized
4. It can be used with any combination with access modifiers
5. Synchronized keyword specially used w.r.t threads for concurrency problem

> native

1. Class cannot be marked as native
2. Methods can be marked as native
3. Variables cannot be marked as native
4. It can be used with any combination with access modifiers except strictfp
5. native keyword states platform dependent code like in C
6. method must be like abstract method

> strictfp

1. Class can be marked as strictfp
2. Methods can be marked as strictfp
3. Variables cannot be marked as strictfp
4. It can be used with any combination with access modifiers except strictfp
5. strictfp keyword states strict floating point IEEE standard platform

Note : Never use combination such as ABSTRACT FINAL, ABSTRACT STATIC, PRIVATE ABSTRACT,
ABSTRACT SYNCHRONIZED, NATIVE SYNCHRONIZED

#. To verify the access, follow the below steps

1. Check Class level access
