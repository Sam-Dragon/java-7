package syncronized_method.pack;

public class SynchronizedMethodsWithAccessModifiers {

	private synchronized void privateSynhronizedMethod() {
		System.out.println("Private Synhronized Method");
	}

	synchronized void defaultSynhronizedMethod() {
		System.out.println("Default Synhronized Method");
	}

	protected synchronized void protectedSynhronizedMethod() {
		System.out.println("Protected Synhronized Method");
	}

	public synchronized void publicSynhronizedMethod() {
		System.out.println("Public Synhronized Method");
	}

	public static void main(String[] args) {
		new SynchronizedMethodsWithAccessModifiers().privateSynhronizedMethod();
		new SynchronizedMethodsWithAccessModifiers().defaultSynhronizedMethod();
		new SynchronizedMethodsWithAccessModifiers().protectedSynhronizedMethod();
		new SynchronizedMethodsWithAccessModifiers().publicSynhronizedMethod();
	}
}
