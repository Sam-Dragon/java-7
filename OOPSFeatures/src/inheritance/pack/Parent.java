package inheritance.pack;

public class Parent {

	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void parenting() {
		System.out.println("Parent Method");
	}
}
