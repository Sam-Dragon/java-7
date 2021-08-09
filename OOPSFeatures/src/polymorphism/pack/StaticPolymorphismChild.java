package polymorphism.pack;

public class StaticPolymorphismChild extends StaticPolymorphismParent {

	public void commonMethod() {
		System.out.println("CommonMethod()");
	}

	public void commonMethod(Integer i) {
		System.out.println("CommonMethod(" + i + ")");
	}

	public void commonMethod(Long i) {
		System.out.println("CommonMethod(" + i + ")");
	}
}
