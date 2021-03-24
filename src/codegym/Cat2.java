package codegym;

public class Cat2 {

	private static int catCount = 0;
	
	public static void setCatCount(int catCount) {
		Cat2.catCount = catCount;
		System.out.println(catCount);
		
	}
	
	
	public static void main(String[] args) {
		Cat2 cat = new Cat2();
		cat.setCatCount(10);
		

	}

}
