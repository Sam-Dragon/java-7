# String
- Mainly used as shared data over network

## String
- It is present in java.lang package
- It is a final class i.e. it cannot be inherited
- It implements java.io.Serializable, Comparable<StringBuffer>, CharSequence
- Strings are group of characters [16 bit - Unicode Character]
- Strings are user-defined datatype
- String are immutable in java. i.e. the object cannot be modified. <br>
  Ex - Immutable Wrapper classes like Class, BiDecimal, Integer, Long etc...
- String as literal or object will be created irrespective of whether they are assigned or not <br>
** It is always required to assign the reference else string will be lost [**Immutable nature**]

> Creation 
- It can be created as 'literal' which is stored in special memory of heap called 'String Constant Pool'. <br>
It can be verified using Address check [ == ] 
- It can be created as 'object', which are stored in memory called 'heap'
- It can be created by accepting character / byte array as constructor argument of String
- It can be created by accepting String buffer / builder as constructor argument of String
- It can be created with 'new' keyword
	- new String();
	- new String(CharSequence); --- String or characters
	- new String(String); --- String can be passed here
	- new String(array, start_position, end_position); --- String can be passed here

> Methods
- charAt(int index) - returns the character at that position
- toUpperCase() - returns the string in upper case
- toLowerCase() - returns the string in lower case
- concat(String s) - returns the string concatenated with input
- equalsIgnoreCase(String s) - returns boolean based on string equality check
- length() - returns the length of the string
- replace(String s1, String s2) - returns string by replacing the character with character (OR) string with string
- subString(int begin, int end) - returns string by taking sub string based on position
- toString() - no use, returns string
- trim() - returns string by replacing white spaces
- toCharArray() - returns char[]
- compareTo(String s) - compare whether two string are equal <br>
if s1 - s2, positive number will be returned <br>
if s1 < s2, negative number will be returned <br>
if s1 == s2, 0 will be returned  <br>
- compareToIgnoreCase(String s) - compare whether two string case insensitively for equality check
- indexOf(String) - get the index of the string or char if found else return -1
- lastIndexOf(String) - get the last index of the string or char if found else return -1
- getChars(beginIndex, EndIndex, ArrayToCopy, BeginIndexOfArray) - Copy string to char array
- split(String) - splits the string based on delimited or regex
- intern() - moves the string from heap to string constant pool

> Don'ts
- Never use '+' operator for appending string

> Advantage
- Because strings are immutable, they can be shared over the network

> Disadvantage
- It wont provide extensibility


# String Builder & String Buffer
- Mainly used for mutability of strings
- Doesn't need any reference for changed value


## String Buffer
- It is a final class
- It extends AbstractStringBuilder
- It implements java.io.Serializable, Comparable<StringBuffer>, CharSequence
- Basically provide mutation on strings
- Mainly used to work on multiple threads as all methods are synchronized. 
Hence performance is low
- It has initial capacity of 16 characters
- Mutation occurs using methods without specifying any reference
- Converting of string buffer to string can be done via toString()

> Creation 
- It can be created with 'new' keyword
	- new StringBuffer();
	- new StringBuffer(CharSequence); --- String or characters
	- new StringBuffer(capacity); --- Change initial capacity [16] to specified one
	- new StringBuffer(String); --- String can be passed here

> Methods
- append(String s) - appends the object at the end of the string
- insert(index, String s) - inserts the value at the specified position
- delete(begin_index, end_index) - deletes the value between begin and end position
- **reverse()** - reverses the input
- **substring(begin_index)** - takes the string from the specified index till the end
- **substring(begin_index, end_index)** - takes the string from the specified beginning and ending index 
- replace(begin_index, end_index, String s) - returns string by replacing the character with character (OR) string with string based on index
- length() - returns the length of the string
- indexOf(String s) - get the index of the string or char if found else return -1
- lastIndexOf(String s) - get the last index of the string or char if found else return -1
- toString() - convert string buffer to string object

> Advantages
- Useful when large manipulation of data is required such as in file, thread-safe way


## String Builder
- Mainly used to work on single thread as all methods are not synchronized. 
Hence performance is high
- Rest all same as String Buffer

> Creation / Methods / Advantages
- Same as String Buffer
