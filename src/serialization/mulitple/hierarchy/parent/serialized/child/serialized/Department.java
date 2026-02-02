package serialization.mulitple.hierarchy.parent.serialized.child.serialized;

public class Department {

	private String id;
	private String name;

	public Department() {
		System.out.println("Department()");
	}

	public Department(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Department(id, name)");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
