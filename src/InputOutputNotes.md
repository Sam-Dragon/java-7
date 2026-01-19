# INPUT - OUTPUT STREAMS

## Streams

- It belongs to java.io package
- it is like a water-pipe
- It can be parsed only once

## Input Streams

- Streams which are used for reading the inputs from the input device i.e. keyword
- System.in : Input Stream Object & in is static variable

## Output Streams

- Streams which are used for writing the inputs from the output device i.e. monitor
- System.out : Print Stream Object & out is static variable [Normal Messages]
- System.err : Print Stream Object & err is static variable [Error Messages]

## Buffered Reader

- It is used for reading the input from the input stream
- It improve the performance as it buffer some set of bits
- Safely put exception for Reader. As It throws IO Exception.

> Methods

- int read() - reads single character but needs to be casted to character
- String readLine() - reads the string and moves to next line
- XXX.parseXXX(reader.readLine()) - It is applicable for all numbers & boolean

> Accepting Single Character from Keyboard

- It can be done using 'read()' method and then conversion <br>
  BufferedReader reader = BufferedReader(new InputStreamReader(System.in)); <br>
  int charNumber = reader.read(); <br>
  char character = (char) charNumber; <br>

> Accepting String from Keyboard

- It can be done using 'readLine()' <br>
  BufferedReader reader = BufferedReader(new InputStreamReader(System.in)); <br>
  String string = reader.readLine(); <br>

> Accepting Number from Keyboard

- It can be done using 'readLine()' along with Wrapper class parse method <br>
  BufferedReader reader = BufferedReader(new InputStreamReader(System.in)); <br>
  Integer integer = Integer.parseInt(reader.readLine()); <br>

> **Problem** While accepting the input due to 'read()' method

- This issue occurs if the read() method is followed by readLine() method
- As read() method accepts single character but when we hit enter, new line character (\n) is passed
  which will be input to the readLine() & hence readLine() wont accept any other input

  > Solution 1 :
    - use bufferedReader.readLine().charAt(0)
    - This solution is effective as we will pick the required number of character and skip others <br><br>

  > Solution 2 :
    - use bufferedReader.skip(2)
        - It is not effective as if extra character is entered it screws up

## String Tokenizer

- StringTokenizer class is used for splitting the string into small pieces called tokens
- It splits the string based on the delimiter

> Methods

- boolean hasMoreTokens() - checks if the input contains more tokens
- String nextToken() - returns the input as string
- boolean hasMoreElements() - checks if the input contains the elements
- Object nextElement() - returns the input as object
- int countTokens() - count the number of token [string]

## Scanner

- Another way to accept the data from the input device. i.e. keyboard
- It internally uses StringTokenizer for splitting the input & it splits by white space
- It needs to be enclosed in try-with-resources

> **Problem** While accepting the input due to 'scanner.next()' method

- This issue occurs if the scanner.next() method is followed by any other method
- As next() method accepts single string but when we hit enter, rest of the string will be passed
  to the next input string which will cause issue

  > Solution
    - use scanner.next() with bufferedReader.nextLine()
    - This solution is effective as we will pick the string till end the line

> **Problem** While accepting the input with 'scanner.nextLine().charAt(0)' method

- This issue occurs if the scanner.nextLine().charAt(0) method is lead by any other method
- So if any scanner method is called before nextLine(). nextLine() accepts input as new line (\n)
  which will result in error

  > Solution
    - use scanner.next().charAt(0)
    - Ensure don't use scanner.nextLine().charAt(0) with scanner.next().charAt(0)

# Display output with printf()

- %s - String, %d - number, %c - character, %b %B - boolean, %o - octal, %x %X - Hexadecimal
  %e %E - Scientific number, %n - new line
