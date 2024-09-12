package access.modifiers.public_class.pack;

public class Access_Same_Package_Class_Via_Reference {

	public static void main(String[] args) {

		PublicClass_PublicMethod_PublicVariable ppp = new PublicClass_PublicMethod_PublicVariable();
		System.out.println(ppp.publicVariable);
		ppp.publicMethod();

		PublicClass_PublicMethod_DefaultVariable ppd = new PublicClass_PublicMethod_DefaultVariable();
		System.out.println(ppd.defaultVariable);
		ppd.publicMethod();

		PublicClass_DefaultMethod_PublicVariable pdp = new PublicClass_DefaultMethod_PublicVariable();
		System.out.println(pdp.publicVariable);
		pdp.defaultMethod();

		PublicClass_DefaultMethod_DefaultVariable pdd = new PublicClass_DefaultMethod_DefaultVariable();
		System.out.println(pdd.defaultVariable);
		pdd.defaultMethod();
	}
}
