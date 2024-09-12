package access.modifiers.default_class.pack;

public class Access_Same_Package_Class_Via_Reference {

	public static void main(String[] args) {

		DefaultClass_PublicMethod_PublicVariable ppp = new DefaultClass_PublicMethod_PublicVariable();
		System.out.println(ppp.publicVariable);
		ppp.publicMethod();

		DefaultClass_PublicMethod_DefaultVariable ppd = new DefaultClass_PublicMethod_DefaultVariable();
		System.out.println(ppd.defaultVariable);
		ppd.publicMethod();

		DefaultClass_DefaultMethod_PublicVariable pdp = new DefaultClass_DefaultMethod_PublicVariable();
		System.out.println(pdp.publicVariable);
		pdp.defaultMethod();

		DefaultClass_DefaultMethod_DefaultVariable pdd = new DefaultClass_DefaultMethod_DefaultVariable();
		System.out.println(pdd.defaultVariable);
		pdd.defaultMethod();
	}
}
