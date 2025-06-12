# Access Modifiers

1. Class can be public, default but not  private, protected
2. Method & Variables can be of any access
3. Local variables can be only final 
4. Public - which is ready accessible by all class
5. Private - which is not accessible by any class except where it is defined
6. Default - which is accessible within the packages
7. Protected - which is accessible by class with in packages and outside packages only via inheritance
8. Variables access via inheritance are private to that class & can be updated if required

#. To verify the access, follow the below steps

1. Check Class level access

- If the class is public, then any class of same package can access it members [Methods & Variables]
either by instance or via inheritance
- If the class is public, then any class of different package can access it members [Methods & Variables]
either by instance or via inheritance

- If the class is default, then any class of same package can access it members [Methods & Variables]
either by instance or via inheritance
- If the class is default, then any class of different package cannot access it members [Methods & Variables]
either by instance or via inheritance

- Class cannot be private or protected


2. Check Member level access [Methods & Variables]

