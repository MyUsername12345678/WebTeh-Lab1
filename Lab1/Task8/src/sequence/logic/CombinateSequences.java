package sequence.logic;
import java.util.Arrays;

public class CombinateSequences {
	
	public int[] getIndexesToPaste(int[] arrayN, int[] arrayM) {
		sortArrays(arrayN, arrayM);
		int[] indexesOfPlaces = new int[arrayM.length];
		int i = 0;
		int j = 0;
		while (i < arrayN.length && j < arrayM.length)
				if (arrayM[j] < arrayN[i])
				{
					indexesOfPlaces[j] = i + 1;
					j++;
				}
				else
					i++;
		while (j < arrayM.length) {
			indexesOfPlaces[j] = arrayN.length + 1;
			j++;
		}
		return indexesOfPlaces;
					
		
	}
	
	private void sortArrays(int[] arrayN, int[] arrayM) {
		Arrays.sort(arrayN);
		Arrays.sort(arrayM);
	}
	
	

}
