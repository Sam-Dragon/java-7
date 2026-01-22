package objects.cloning.shallow;

class ShallowCloningAddress implements Cloneable {

    String street;
    String house_number;

    public ShallowCloningAddress(String street, String house_number) {
        this.street = street;
        this.house_number = house_number;
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

class ShallowCloningClass implements Cloneable {

    String name;
    String description;
    ShallowCloningAddress address;

    public ShallowCloningClass(String name, String description, ShallowCloningAddress address) {
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ShallowCloningAddress getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "[ name='" + name + ", description=" + description + ", " + address + "]";
    }

    @Override
    public Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCloningUsingCloneMethod {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        ShallowCloningAddress address = new ShallowCloningAddress("8th main road", "12");
        ShallowCloningClass actualObject = new ShallowCloningClass("Shallow Cloning", "Default Type Of Cloning",
                address);
        System.out.println("Original Actual Object Reference :: " + actualObject.hashCode());
        System.out.println("Original Actual Object Content :: " + actualObject);

        ShallowCloningClass clonedObject = (ShallowCloningClass) actualObject.clone();
        clonedObject.getAddress()
                    .setStreet("678909876545678op9876");

        System.out.println("Copied Object Reference :: " + clonedObject.hashCode());

        System.out.println();
        System.out.println("Copied Object Content :: " + clonedObject);
        System.out.println("Updated Actual Object Content :: " + actualObject);
        System.out.println(
                ">> Note: Changes in copied object changes the content of original object. check the street value");

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
