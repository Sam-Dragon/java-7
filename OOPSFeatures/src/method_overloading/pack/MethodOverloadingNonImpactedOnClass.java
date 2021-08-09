package method_overloading.pack;

public class MethodOverloadingNonImpactedOnClass extends MethodOverloadingSameClass {

	public Short method(Short i) {
		System.out.println("MethodOverloading with different arguments but returns Short [No Impact]");
		return i;
	}

	public void method(Integer i) throws Exception {
		System.out.println("MethodOverloading with different arguments but throws exception [No Impact]");
	}

	void method(Long l) {
		System.out.println("MethodOverloading with different arguments but with Default access [No Impact]");
	}
}
