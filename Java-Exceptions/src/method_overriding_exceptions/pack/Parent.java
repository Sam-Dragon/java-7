package method_overriding_exceptions.pack;

import java.io.File;
import java.io.IOException;

public class Parent {

	String method() throws IOException {
		File file = new File("abc.txt");
		return file.getPath();
	}
}