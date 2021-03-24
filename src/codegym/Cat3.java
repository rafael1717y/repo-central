package codegym;

public class Cat3 {

	private String fullName;
	
	public void setName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		this.fullName = fullName;
	}
	
	
	public static void main(String[] args) {
		Cat3 cat = new Cat3();
		cat.setName("Rafael", "Gomes");

	}

}
