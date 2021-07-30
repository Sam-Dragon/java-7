package native_method.pack;

public class NativeMethodsInAbstractClass {
	private native void privateNativeMethod();

	native void defaultNativeMethod();

	protected native void protectedNativeMethod();

	public native void publicNativeMethod();

	final native void finalNativeMethod();

	static native void staticNativeMethod();

//	strictfp native void strictfpNativeMethod();
}
