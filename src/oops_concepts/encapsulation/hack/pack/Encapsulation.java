package oops_concepts.encapsulation.hack.pack;

import java.math.BigDecimal;

public class Encapsulation {

	public String name;
	public Integer age;
	public Boolean seniorCitizen;
	public BigDecimal salary;
	public Character gender;

	public Encapsulation(String name, Integer age, Boolean seniorCitizen, BigDecimal salary, Character gender) {
		super();
		this.name = name;
		this.age = age;
		this.seniorCitizen = seniorCitizen;
		this.salary = salary;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean IsSeniorCitizen() {
		return seniorCitizen;
	}

	public void setSeniorCitizen(Boolean seniorCitizen) {
		this.seniorCitizen = seniorCitizen;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", age=" + age + ", seniorCitizen=" + seniorCitizen + ", salary="
				+ salary + ", gender=" + gender + "]";
	}

}
