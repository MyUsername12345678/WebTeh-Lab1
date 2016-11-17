package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import classes.Ball;

public class testBall {

	@Test
	public void test() {
		Ball ball = new Ball ("yellow", 6);
		assertTrue(ball.getColor() == "yellow" && ball.getWeight() == 6);
	}

}
