package serilization.inheritance;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationMultipleObjects {

	public static void main(String[] args) {
		String fileName = "inheritance.ser";
		
		serializeTheObject(fileName);
	}

	private static void serializeTheObject(String fileName) {
		System.out.println("<< Serialization >> ");
		Department department = new Department(1, "Serialized Object 1");

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
			System.out.println("Serialized Department :: " + department.weight);
			oos.writeObject(department);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
