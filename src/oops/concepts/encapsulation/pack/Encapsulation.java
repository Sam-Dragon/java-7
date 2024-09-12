package oops.concepts.encapsulation.pack;

import java.math.BigDecimal;

public class Encapsulation {

	private String name;
	private Integer age;
	private Boolean seniorCitizen;
	private BigDecimal salary;
	private Character gender;

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

}
