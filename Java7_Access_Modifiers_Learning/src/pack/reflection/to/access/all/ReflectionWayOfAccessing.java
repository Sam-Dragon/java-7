package pack.reflection.to.access.all;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionWayOfAccessing {

	public static void main(String[] args) throws Exception {
		DefaultClassWithPrivateMethodsAndVariables classObj = new DefaultClassWithPrivateMethodsAndVariables();

		Method method = classObj.getClass().getDeclaredMethod("privateMethod");
		method.setAccessible(true);

		method.invoke(classObj, null);

		Field field = classObj.getClass().getDeclaredField("privateVariable");
		field.setAccessible(true);

		System.out.println(field.get(classObj));

		Class obj = Class.forName("pack.reflection.to.access.all.DefaultClassWithPrivateMethodsAndVariables");
		classObj = (DefaultClassWithPrivateMethodsAndVariables) obj.getConstructor().newInstance();

		method = classObj.getClass().getDeclaredMethod("privateMethod");
		method.setAccessible(true);

		method.invoke(classObj, null);

		field = classObj.getClass().getDeclaredField("privateVariable");
		field.setAccessible(true);

		System.out.println(field.get(classObj));
	}
}
