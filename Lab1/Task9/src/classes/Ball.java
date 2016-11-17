package classes;

public class Ball {
	
	public Ball (String color, int weight) {
		this.color = color;
		this.weight = weight;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getWeight() {
		return weight;
	}
	
	private String color;
	private int weight;
	
}
