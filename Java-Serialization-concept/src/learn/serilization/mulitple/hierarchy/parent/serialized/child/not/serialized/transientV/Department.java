package learn.serilization.mulitple.hierarchy.parent.serialized.child.not.serialized.transientV;

public class Department {

	private Integer id;

	public Department() {
		System.out.println("Department()");
	}

	public Department(Integer id) {
		super();
		this.id = id;
		System.out.println("Department(id, name)");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + "]";
	}

}
