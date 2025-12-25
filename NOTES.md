<h3>JAVA NOTES</h3>

<details>
<summary>ARRAYS</summary>

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
- It is not **final class**. i.e. it can be **inherited** and modified
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

> Methods

- length - number of elements in the array

> Jagged Arrays

- Special type of array when end length is not fixed
- Declaration
    - int[][] literalArray = new int[3][];

> Interesting

- It can create array for Thread class, Interface etc.
- "CopyOnWriteArrayList", Atomic Arrays is used for thread-safe operations

</details>
<br>

<details>
<summary>STRINGS</summary>

> Definition

- It is present in language package of java. i.e. java.lang
- It represents group characters
- It is created as **objects** only
- They reside in **HEAP** section of the memory
- It is final class, hence class cannot be inherited
- It is immutable by nature. i.e. contents cannot be modified
- It is thread-safe in nature
- It implements java.io.Serializable, Comparable<StringBuffer>, CharSequence
- It is user-defined datatype
- ** It is always required to assign the reference else string will be lost [**Immutable nature**]

> Advantage

- It allows **data immutability** hence data can be shared over the network
- prevents extensibility

> Disadvantage

- Its data cannot be modified. we need rather String Builder / String Buffer classes

> Creation

- String literal = "abc"; // created in string constant pool in heap
- String object = new String("abc"); // stored in heap
- char[] chars = {'a', 'b', 'c'}; <br>
  String charToString = new String(chars); // stored in heap

> Methods

- **charAt(int index)** - returns the character at that position
- toUpperCase() - returns the string in upper case
- toLowerCase() - returns the string in lower case
- concat(String s) - returns the string concatenated with input
- **equalsIgnoreCase(String s)** - returns boolean based on string equality check
- length() - returns the length of the string
- **replace(String s1, String s2)** - returns string by replacing the character with character (OR) string with string
- **subString(int begin, int end)** - returns string by taking sub string based on position
- toString() - no use, returns string
- trim() - returns string by replacing white spaces
- **toCharArray()** - returns char[]
- compareTo(String s) - compare whether two string are equal <br>
  if s1 - s2, positive number will be returned <br>
  if s1 < s2, negative number will be returned <br>
  if s1 == s2, 0 will be returned  <br>
- compareToIgnoreCase(String s) - compare whether two string case insensitively for equality check
- **indexOf(String)** - get the index of the string or char if found else return -1
- lastIndexOf(String) - get the last index of the string or char if found else return -1
- getChars(beginIndex, EndIndex, ArrayToCopy, BeginIndexOfArray) - Copy string to char array
- **split(String)** - splits the string based on delimited or regex
- intern() - moves the string from heap to string constant pool

> Interesting

- To compare the contents of the string, always use ".equals()" method, "==" is used for matching reference.
- Never use '+' operator for appending string, rather use ".concat(str)"

</details>
<br>

<details>
<summary>STRING BUFFER</summary>

- Mainly used for mutability of strings
- Doesn't need any reference for changed value

> Definition

- It is a **final class**
- It extends AbstractStringBuilder
- It implements java.io.Serializable, Comparable<StringBuffer>, CharSequence
- Basically provide mutation on strings
- Mainly used to work on multiple threads as all methods are **synchronized**.
  Hence performance is low
- It has initial capacity of 16 characters
- Mutation occurs using methods **without specifying any reference**
- Converting of string buffer to string can be done via toString()
- It is useful in **multithreaded** environment

> Creation

- StringBuffer emptyStringBuffer = new StringBuffer();
- StringBuffer charStringBuffer = new StringBuffer(CharSequence); --- String or characters
- StringBuffer capacityStringBuffer = new StringBuffer(capacity); --- Change initial capacity [16] to specified one
- StringBuffer stringBuffer = new StringBuffer(String); --- String can be passed here

> Methods

- **append(String s)** - appends the object at the end of the string
- **insert(index, String s)** - inserts the value at the specified position
- **delete(begin_index, end_index)** - deletes the value between begin and end position
- **reverse()** - reverses the input
- **substring(begin_index)** - takes the string from the specified index till the end
- **substring(begin_index, end_index)** - takes the string from the specified beginning and ending index
- replace(begin_index, end_index, String s) - returns string by replacing the character with character (OR) string with
  string based on index
- length() - returns the length of the string
- indexOf(String s) - get the index of the string or char if found else return -1
- lastIndexOf(String s) - get the last index of the string or char if found else return -1
- toString() - convert string buffer to string object

> Advantages

- Useful when large manipulation of data is required such as in file, thread-safe way

</details>
<br>

<details>
<summary>STRING BUILDER</summary>

> Definition

- Mainly used to work on single thread as all methods are **not synchronized**.
  Hence performance is high
- It is useful in **single threaded** environment

> Creation / Methods / Advantages

- Same as String Buffer

</details>
<br>