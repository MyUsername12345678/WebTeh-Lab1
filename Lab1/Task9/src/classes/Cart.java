package classes;


import java.util.ArrayList;
import classes.Ball;

public class Cart {

	private ArrayList<Ball> balls = new ArrayList<Ball>();
	
	public void addBall(Ball ball) {
		balls.add(ball);
	}
		
	public void removeBall(Ball ball) {
		balls.remove(ball);
	}
	
	public void removeBall(int index) {
		balls.remove(index);
	}
	
	public int get—ountColorBalls(String color) {
		int result = 0;
		for (Ball ball : balls) {
			if (ball.getColor() == color)
				result++;
		}
		return result;
	}
	
	public int getWeight() {
		int result = 0;
		for (Ball ball : balls) {
			result += ball.getWeight();
		}
		return result;
	}
}
