package learn.serilization.mulitple.hierarchy.parent.serialized.child.not.serialized;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationByCustomId {

	public static void main(String[] args) {
		String fileName = "parentSerializedChildNotSerializedSerialization.ser";
		serializeTheObject(fileName);
	}

	private static void serializeTheObject(String fileName) {
		System.out.println("<< Serialization >> ");
		Employee employee = new Employee("1", "Serialized Object 1", new Department("1", "Department 1"));

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
			System.out.println("Serialized Employee :: " + employee);
			oos.writeObject(employee);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
