package classes;

import classes.Ball;
import classes.Cart;

class MainClassCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String YELLOW = "yellow";
		final String BLUE = "blue";
		final String RED = "red";
		Cart cart = new Cart();
		cart.addBall(new Ball(YELLOW, 5));
		cart.addBall(new Ball(BLUE, 4));
		cart.addBall(new Ball(RED, 3));
		cart.addBall(new Ball(YELLOW, 8));
		cart.addBall(new Ball(BLUE, 6));
		System.out.println("Blue balls = " + cart.get—ountColorBalls("blue"));
		System.out.println("Weight = " + cart.getWeight());
	}

}
