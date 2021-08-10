package method_overriding_exceptions.pack;

import java.io.File;
import java.io.FileNotFoundException;

public class Child extends Parent {

	// Accepted
	String method() throws FileNotFoundException {
//	String method() throws IOException {
		File file = new File("abc.txt");
		return file.getPath();
	}
	
	// Not accepted - Child cannot be greater than parent
	//	String method() throws Exception {
}