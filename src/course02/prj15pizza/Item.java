package course02.prj15pizza;

public enum Item {
	
	CHEESE("CHEESE"), VEGGIE("VEGGIE"), CLAM("CLAM"), PEPPERONI("PEPPERONI");
	
	private String value;
	
	private Item(String value) {
		this.value = value;
		// TODO Auto-generated constructor stub
	}
	public String getValue() {
		return value;
	}
}
