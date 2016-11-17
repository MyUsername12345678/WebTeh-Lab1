package dotchecker.logic;

public class DotCheck {

	private static final int Y_OVER_AXIS = 5;
	private static final int X_OVER_AXIS_LEFT = -4;
	private static final int X_OVER_AXIS_RIGHT = 4;
	private static final int Y_UNDER_AXIS = -3;
	private static final int X_UNDER_AXIS_LEFT = -6;
	private static final int X_UNDER_AXIS_RIGHT = 6;
	
	public boolean checkDot(double x, double y) {
		boolean result = false;
		if (y >= 0) {
			if (y <= Y_OVER_AXIS && (x >= X_OVER_AXIS_LEFT && x <= X_OVER_AXIS_RIGHT))
				result = true;
		}
		else {
			if (y >= Y_UNDER_AXIS && (x >= X_UNDER_AXIS_LEFT && x <= X_UNDER_AXIS_RIGHT))
				result = true;
		}
		return result;		
	}
}
