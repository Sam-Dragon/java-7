<details>
<summary>ARRAYS</summary>
<br>
  
> Definition

- It is present in language package of java. i.e. java.lang
- It represents group of data with **same data type**
- It follows **IS-A** relationship
- It is created as **objects** only
- They reside in **HEAP** section of the memory

> Advantage

- It can store both **primitives** and **objects**
- It allows **back and forth traversal** due to indexes
- It allows **data mutability**

> Disadvantage

- Its length is fixed. **re-sizing** array hits performance
- It must be not used in **concurrent** cases else exception is thrown [Not Thread-safe]
- It is not **final class**. i.e. it can be inherited and modified
- Indexes can cause issues it improper index is accessed resulting in exception

> Creation
- int[] literalArray = {1,2,3};
- int[] literalArray = new int[3];
- int[] literalArray = new int[]{1,2,3};

> Types
- 1D Array
  - int[] literalArray = new int[3];
- 2D Array
  - int[][] literalArray = new int[3][3];  

> Jagged Arrays

- Special type of array when end length is not fixed  
- Example
  - int[][] literalArray = new int[3][]; 

</details>
<br>
