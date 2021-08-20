package learn.serilization.basics.jvmid;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerilizationByJvmId {

	public static void main(String[] args) {
		String fileName = "jvmIdSerialization.ser";

		deSerializeTheObject(fileName);
	}

	private static void deSerializeTheObject(String fileName) {
		System.out.println("<< Deserialization >> ");
		Employee employee = null;

		try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(new File(fileName)))) {
			employee = (Employee) oos.readObject();
			System.out.println("Deserialized Employee :: " + employee);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}