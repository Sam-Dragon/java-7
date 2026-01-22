package objects.cloning.deep;

class DeepCloningConstructorAddress implements Cloneable {

    String street;
    String house_number;

    public DeepCloningConstructorAddress(String street, String house_number) {
        this.street = street;
        this.house_number = house_number;
    }

    public DeepCloningConstructorAddress(DeepCloningConstructorAddress actualAddress) {
        this.street = actualAddress.street;
        this.house_number = actualAddress.house_number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "[ street='" + street + ", house_number=" + house_number + "]";
    }
}

class DeepCloningConstructorClass implements Cloneable {

    String name;
    String description;
    DeepCloningConstructorAddress address;

    public DeepCloningConstructorClass(String name, String description, DeepCloningConstructorAddress address) {
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public DeepCloningConstructorClass(DeepCloningConstructorClass actualObject) {
        this.name = actualObject.name;
        this.description = actualObject.description;
        this.address = new DeepCloningConstructorAddress(actualObject.getAddress());
    }

    public String getName() {
        return name;
    }

    public DeepCloningConstructorAddress getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "[ name='" + name + ", description=" + description + ", " + address + "]";
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        DeepCloningConstructorClass cloned = (DeepCloningConstructorClass) super.clone(); // shallow copy first
        cloned.address = (DeepCloningConstructorAddress) address.clone(); // deep copy
        return cloned;
    }
}

public class DeepCloningUsingCopyConstructor {

    public static void main(String[] args)
            throws CloneNotSupportedException {
        DeepCloningConstructorAddress address = new DeepCloningConstructorAddress("8th main road", "12");
        DeepCloningConstructorClass actualObject = new DeepCloningConstructorClass("Deep Cloning",
                "Default Type Of Cloning",
                address);
        System.out.println("Actual Object Reference :: " + actualObject.hashCode());
        System.out.println("Actual Object Content :: " + actualObject);

        DeepCloningConstructorClass clonedObject = new DeepCloningConstructorClass(actualObject);
        clonedObject.getAddress()
                    .setStreet("678909876545678op9876");
        System.out.println("Cloned Object Reference :: " + clonedObject.hashCode());

        System.out.println();
        System.out.println("Cloned Object Content :: " + clonedObject);
        System.out.println("Updated Actual Object Content :: " + actualObject);
        System.out.println(
                ">> Note: Changes in not copied object changes the content of original object. check the street value");

        /*System.out.println(
                "Actual Object Reference == Cloned Object Reference ? " + (actualObject.hashCode() == clonedObject
                .hashCode()));
        System.out.println("Actual Object Name equals Cloned Object Name ? " + (actualObject.getName()
                                                                                            .equals(clonedObject
                                                                                            .getName())));
        System.out.println("Actual Object Desc equals Cloned Object Desc ? " + (actualObject.getDescription()
                                                                                            .equals(clonedObject
                                                                                            .getDescription())));

        System.out.println("Address Object == Cloned Address Object ? " + (actualObject.getAddress()
                                                                                       .hashCode() == clonedObject
                                                                                       .getAddress()
                                                                                                                  .hashCode()));*/

    }
}
