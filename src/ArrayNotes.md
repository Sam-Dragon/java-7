# Arrays
- It represents grouping of elements with same data type
- They are objects and are stored on heap
- Mainly used for storing collection of data 

## Array
- It is present in java.lang
- It is a not a final class i.e. it can be inherited
- They are user-defined datatype
- They are not immutable in java. i.e. the object can be modified. <br>
- It is index based, all operations needs to be performed via index only <br>
- It is not thread-safe by nature. 
- "CopyOnWriteArrayList", Atomic Arrays is used for thread-safe operations

> Creation 
- It can be created as 'literal' which is stored in dynamic memory of heap. <br> 
  - var arr = {1,2,3} <br>
- It can be created with 'new' keyword
	- new Integer[];
	- new Integer[] {1,2,3} ---- with literal

> Methods
- length - returns the length of the array

> Advantage
- It stores collection of data
- It can store primitive and objects

> Disadvantage
- It is index based, if index is missed, it throws exception
- Its length is fixed, resizing of array hits performance
- It is mutable in nature, its contents can be modified
- cannot store data with different types
