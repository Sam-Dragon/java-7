package public_class.protected_usage.pack;

public class Access_Same_Package_Class_Via_Reference {

	public static void main(String[] args) {

		PublicClass_ProtectedMethod_ProtectedVariable ppp = new PublicClass_ProtectedMethod_ProtectedVariable();
		System.out.println(ppp.protectedVariable);
		ppp.protectedMethod();

		PublicClass_ProtectedMethod_DefaultVariable ppd = new PublicClass_ProtectedMethod_DefaultVariable();
		System.out.println(ppd.defaultVariable);
		ppd.protectedMethod();

		PublicClass_DefaultMethod_ProtectedVariable pdp = new PublicClass_DefaultMethod_ProtectedVariable();
		System.out.println(pdp.protectedVariable);
		pdp.defaultMethod();

		PublicClass_DefaultMethod_DefaultVariable pdd = new PublicClass_DefaultMethod_DefaultVariable();
		System.out.println(pdd.defaultVariable);
		pdd.defaultMethod();
	}
}
