package access_modifiers.public_class.pack.external;

import access_modifiers.public_class.pack.PublicClass_DefaultMethod_DefaultVariable;
import access_modifiers.public_class.pack.PublicClass_DefaultMethod_PublicVariable;
import access_modifiers.public_class.pack.PublicClass_PublicMethod_DefaultVariable;
import access_modifiers.public_class.pack.PublicClass_PublicMethod_PublicVariable;

/**
 * Default cannot be access via Inheritance
 * 
 * @author Admin
 */
public class Access_External_Package_Class_Via_Reference {

	public static void main(String[] args) {

		PublicClass_PublicMethod_PublicVariable ppp = new PublicClass_PublicMethod_PublicVariable();
		System.out.println(ppp.publicVariable);
		ppp.publicMethod();

		PublicClass_PublicMethod_DefaultVariable ppd = new PublicClass_PublicMethod_DefaultVariable();
		// System.out.println(ppd.defaultVariable);
		ppd.publicMethod();

		PublicClass_DefaultMethod_PublicVariable pdp = new PublicClass_DefaultMethod_PublicVariable();
		System.out.println(pdp.publicVariable);
		// pdp.defaultMethod();

		PublicClass_DefaultMethod_DefaultVariable pdd = new PublicClass_DefaultMethod_DefaultVariable();
		// System.out.println(pdd.defaultVariable);
		// pdd.defaultMethod();
	}
}
