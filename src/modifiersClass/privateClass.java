package modifiersClass;

class privateClass {
	
	private String name;
	private void hello() {
		System.out.println("Public Hello Method");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
