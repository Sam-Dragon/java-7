package objects.cloning.shallow;

class ShallowCloningConstructorAddress {

    String street;
    String house_number;

    public ShallowCloningConstructorAddress(String street, String house_number) {
        this.street = street;
        this.house_number = house_number;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    @Override
    public String toString() {
        return "[ street='" + street + ", house_number=" + house_number + "]";
    }
}

class ShallowCloningConstructorClass {

    String name;
    String description;
    ShallowCloningConstructorAddress address;

    public ShallowCloningConstructorClass(String name, String description, ShallowCloningConstructorAddress address) {
        this.name = name;
        this.description = description;
        this.address = address;
    }

    // COPY CONSTRUCTOR
    public ShallowCloningConstructorClass(ShallowCloningConstructorClass actualObject) {
        this.name = actualObject.name;
        this.description = actualObject.description;
        this.address = actualObject.address;
    }

    public String getName() {
        return name;
    }

    public ShallowCloningConstructorAddress getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "[ name='" + name + ", description=" + description + ", " + address + "]";
    }
}

public class ShallowCloningUsingCopyConstructor {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        ShallowCloningConstructorAddress address = new ShallowCloningConstructorAddress("8th main road", "12");
        ShallowCloningConstructorClass actualObject = new ShallowCloningConstructorClass("Shallow Cloning",
                "Default Type Of Cloning",
                address);
        System.out.println("Original Actual Object Reference :: " + actualObject.hashCode());
        System.out.println("Original Actual Object Content :: " + actualObject);

        // copy constructor called
        ShallowCloningConstructorClass clonedObject = new ShallowCloningConstructorClass(actualObject);
        clonedObject.getAddress()
                    .setStreet("678909876545678op9876");
        System.out.println("Cloned Object Reference :: " + clonedObject.hashCode());

        System.out.println();
        System.out.println("Cloned Object Content :: " + clonedObject);
        System.out.println("Updated Actual Object Content :: " + actualObject);
        System.out.println(
                ">> Note: Changes in copied object changes the content of original object. check the street value");
    }
}
