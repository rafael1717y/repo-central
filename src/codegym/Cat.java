package codegym;

public class Cat {
	
	private static int catCount = 0;
	
	public static void addNewCat() {
		System.out.println("número de gatos:" + catCount);
		catCount = catCount + 1;
		System.out.println("número de gatos:" + catCount);
		
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.addNewCat();
		cat.addNewCat();
		cat.addNewCat();
		
	}
	
	
	
}