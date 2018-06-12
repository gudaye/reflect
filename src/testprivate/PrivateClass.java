package testprivate;

public class PrivateClass {
	
	private String name;

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PrivateClass [name=" + name + "]";
	}
	
}
