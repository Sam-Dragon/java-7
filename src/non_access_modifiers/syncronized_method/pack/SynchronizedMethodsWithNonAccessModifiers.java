package non_access_modifiers.syncronized_method.pack;

public class SynchronizedMethodsWithNonAccessModifiers {

	final synchronized void finalSynhronizedMethod() {
		System.out.println("Final Synhronized Method");
	}

	static synchronized void staticSynhronizedMethod() {
		System.out.println("Static Synhronized Method");
	}

	strictfp synchronized void strictfpSynhronizedMethod() {
		System.out.println("Strictfp Synhronized Method");
	}
}
