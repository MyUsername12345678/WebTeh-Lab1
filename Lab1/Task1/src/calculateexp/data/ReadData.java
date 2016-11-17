package calculateexp.data;

import java.util.Scanner;
import readdata.ReaderData;;

public class ReadData {

	ReaderData readerData = new ReaderData();
	
	public void setX(Scanner scanner) {
		this.x = readerData.setDoubleValue("x = ", scanner);
	}
	
	public void setY(Scanner scanner) {
		this.x = readerData.setDoubleValue("y = ", scanner);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	
	private double x;
	private double y;
}
