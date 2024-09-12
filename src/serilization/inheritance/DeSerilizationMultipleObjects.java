package serilization.inheritance;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerilizationMultipleObjects {

	public static void main(String[] args) {
		String fileName = "inheritance.ser";

		deSerializeTheObject(fileName);
	}

	private static void deSerializeTheObject(String fileName) {
		System.out.println("<< Deserialization >> ");
		Department department = null;

		try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(new File(fileName)))) {
			department = (Department) oos.readObject();
			System.out.println("Deserialized Department :: " + department.weight);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}