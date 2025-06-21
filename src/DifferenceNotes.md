# STRING

1. Difference b/w String And String Builder Or String Buffer ? <br>
A. String are immutable objects whereas String builder / Buffer are mutable <br>
   String methods needs to be referenced for modification whereas String builder / builder doesn't need as it updates internally <br>
   String consumes more memory because literal will stay in memory whereas String Builder / buffer doesn't as string object keeps updating <br>
   String doesn't support useful methods such as insert, delete etc.. whereas String builder / buffer supports the same

2. Difference b/w String Builder And String Buffer <br>
A. String Builder is single threaded whereas String Buffer is multi-threaded <br>
   String Builder performance is high whereas String Buffer is low as methods are synchronized <br>
   String Builder methods are NOT synchronized in nature whereas String Buffer method are synchronized

3. Difference b/w String constant pool & Heap ? <br>
A. It is special memory of heap which stores the string objects which are unique whereas for heap it creates objects without     any uniqueness <br>
   Any string object is checked against string constant pool if created as literal whereas for heap it will create object       every time <br>
   String objects in pool wont be destroyed whereas string objects will be garbage collected post usage

4. Method Overloading vs Method Overriding
A  Method overloading must have different arguments whereas Method overriding must have same arguments list <br> 
   Method overloading is meant for code refinement whereas Method overriding is meant for code replacement <br>
   Method overloading can have same or different of return type whereas Method overriding is must have same return type          [Except for Covariant returns] <br>
   Method overloading can have same or different of exceptions whereas Method overriding is must have same exceptions <br>
   Method overloading can have same or different of access whereas Method overriding is must have same access <br>
   Method overloading can be done in same or different class whereas Method overriding is must be done in different class <br>
   JVM decides which method to pick depending on difference in method signature whereas for method overriding, JVM decides       based on the object called <br>
   Method overloading provides programmer a way to extend the already available feature whereas Method overriding provides       programmer to provide different functionality for same feature
