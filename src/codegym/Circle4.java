package codegym;

public class Circle4 {
	
	public class Color {
		String description;
		
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
	
	public Color color; //
	
	public Circle4() {
		color = new Color();
	}
	
	
		
	public static void main(String[] args) {
		Circle4 circle = new Circle4();
		circle.color.setDescription("Red");
		System.out.println(circle.color.getDescription());

	}

}
