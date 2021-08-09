package encapsulation.hack.pack;

import java.math.BigDecimal;

public class EncapsulationProblemWithPublicVariables {

	public static void main(String[] args) {

		Encapsulation encapsulation = new Encapsulation("Sample", 23, false, BigDecimal.valueOf(5455698652.5), 'M');
		System.out.println(encapsulation);

		System.out.println("\nUpdating variable by directly accessing it");
		encapsulation.age = 29;
		System.out.println(encapsulation);

		System.out.println("\nUpdating variable by setter method");
		encapsulation.setSalary(BigDecimal.valueOf(5455698655.0));
		System.out.println(encapsulation);
	}
}
