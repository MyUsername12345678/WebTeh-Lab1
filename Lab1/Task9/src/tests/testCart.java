package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import classes.Ball;
import classes.Cart;

import org.junit.Test;

public class testCart {

	Cart cart = new Cart();
	
	@Before
	public void init() {
		cart = new Cart();
		cart.addBall(new Ball("yellow", 6));
		cart.addBall(new Ball("blue", 4));
		cart.addBall(new Ball("red", 1));
		cart.addBall(new Ball("blue", 9));
		cart.addBall(new Ball("blue", 3));
	}
	
	@After
	public void tearDown() {
		cart = null;
	}
	
	@Test
	public void testCountBlue() {
		int actual = cart.get—ountColorBalls("blue");
		int expected = 3;
		assertTrue(actual == expected);
	}
	
	@Test
	public void testWeight() {
		int actual = cart.getWeight();
		int expected = 23;
		assertTrue(actual == expected);
	}

}
