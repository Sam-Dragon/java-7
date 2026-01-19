********************************* SERIALIZATION ************************************

> It is the process of saving the object & all its instance variables
> It can be saved in file, memory or database
> It can provide serialization id which is long or it will be injected by JVM if not
> present
> Data is converted to Byte streams and are platform independent
> It maintains the Object graphs
> It doesn't work on static variables as they belong to class
> It works in two steps

- Serialize the object & writes into the object
- deSerialize the object & read from object

# Serialization Id

> It must be same while serializing and de-serializing the object else it will
> throw 'java.io.InvalidClassException' 	
> If the serialization & de-serialization is done by jvm id & if de-serialized
> object contains different value then exception will be thrown
> If the serialization & de-serialization is done by default / custom id
> then de-serialized object contains different value then it will work

# Serialize the object & writes into the object

- It can be done using 'ObjectOutputStream'
- It will call method called 'write' method to write the data into resource

# De-serialize the object & read from object

- It can be done using 'ObjectInputStream'
- It will call method called 'read' method to read the data into resource
- Cast the object to specific type

# Serialization for hierarchy of objects [Employee has Department]

> If the parent is serialized, then child has to be serialized else it will
> throw 'java.io.NotSerializableException'
> If the parent is serialized, then child is not serialized then we can use transient
> variable to save the employee object even if department is null
> If the parent is serialized, then child is also serialized then it works
> If the parent is not serialized, then child is also serialized then it will
> throw 'java.io.NotSerializableException'

# transient

- It does not save the state [variables] of the object
- It resets all the values to its defaults
- It can be used for some calculations during the serialization process as it will
  be dissolved during serialization
- It can save the state of the object only if writeObject & readObject are overridden
  in the serialized class [parent]

# Inheritance

> We don't have to serialize the CHILD object & class cannot be final