package serilization.basics.jvmid;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationByJvmId {

	public static void main(String[] args) {
		String fileName = "jvmIdSerialization.ser";
		serializeTheObject(fileName);
	}

	private static void serializeTheObject(String fileName) {
		System.out.println("<< Serialization >> ");
		Employee employee = new Employee("1", "Serialized Object");

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
			System.out.println("Serialized Employee :: " + employee);
			oos.writeObject(employee);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
