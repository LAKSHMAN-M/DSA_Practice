package LinearSearch;
import java.util.Arrays;

public class LinearSearchIn2DArray {
	public static void main(String[] args) {
		int[][] array = { { 1, 3, 4, 5, 6 }, 
						  { 4, 5, 6, 1 }, 
						  { 5, 6, 6, 55 } 
						};
		System.out.println(Arrays.toString(search(array, 111)));
	}

//	search an element in an array 

	static int[] search(int[][] array, int target) {
		int[] index = new int[2];
		if (array.length == 0) {
			return new int[] {-1};
		}
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				int currentElement = array[row][col];
				if(currentElement == target) {
					index[0] = row;
					index[1] = col;
					return index;
				}
				
			}
		}
		return new int[] {-1};
	}
}