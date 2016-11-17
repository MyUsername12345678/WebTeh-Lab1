package deleter.logic;

public class DeleteNumbers {
	
	public int findCountNumbersToDelete(int[] arrayOfNumbers)
	{
		if(arrayOfNumbers != null)
		{
			findMaxSequence(arrayOfNumbers, 0, arrayOfNumbers[0], 1);
			return arrayOfNumbers.length - maxLength;
		}
		return -1;
	}
	
	private void findMaxSequence(int[] arrayOfNumbers, int i, int lastNumber, int currentMax)
	{
		if(i == arrayOfNumbers.length-1) {
			if (maxLength < currentMax)
				maxLength = currentMax;
		}
		else
		{
			if(lastNumber < arrayOfNumbers[i+1])
				findMaxSequence(arrayOfNumbers, i+1, arrayOfNumbers[i+1], currentMax+1);
			findMaxSequence(arrayOfNumbers, i+1, lastNumber, currentMax);
			findMaxSequence(arrayOfNumbers, i+1, arrayOfNumbers[i+1], 1);
		}
		
	}
	
	private int maxLength;
}
