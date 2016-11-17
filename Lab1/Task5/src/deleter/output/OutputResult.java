package deleter.output;

public class OutputResult {

	public void printResult(int result) {
		if (result >= 0)
			System.out.println("You need to delete " + result); 
		else
			System.out.println("Wrong data");
			
	}
	
}
