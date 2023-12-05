package LinearSearch;
import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 9, 19 };
		int target = 19;
		int index = linearSearchInRange(arr, target, 3, 6);
		System.out.println(index);
//		String[] str = { "Lakshman", "ramu", "k" };
//		System.out.println(linearSearchStrings(str, "K"));
//		System.out.println(linearSearchCharacters(str[0].toCharArray(), 'n'));
		System.out.println(Arrays.toString(minMax(arr)));
	}

//	Search in Numbers
	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			int currentElement = arr[index];
			if (currentElement == target) {
				return index;
			}
		}
		return -1;
	}

//	Search in Strings
	static int linearSearchStrings(String[] arr, String target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			String currentElement = arr[index];
			if (currentElement.equalsIgnoreCase(target)) {
				return index;
			}
		}
		return -1;
	}

//	Search in Characters 
	static int linearSearchCharacters(char[] arr, char target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			char currentElement = arr[index];
			if (currentElement == target) {
				return index;
			}
		}
		return -1;
	}

// Search in Range 
	static int linearSearchInRange(int[] arr, int target, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = start; index <= end; index++) {
			int currentElement = arr[index];
			if (currentElement == target) {
				return index;
			}
		}
		return -1;
	}

// Minimum Number in an Array 
	static int min(int[] arr) {
		if (arr.length == 0)
			return -1;
		int firstElement = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if(firstElement < arr[index]) {
				firstElement = arr[index];
			}
		}
		return firstElement;
	}
	static int[] minMax(int[] arr) {
		if (arr.length == 0)
			return new int[]{-1};
		int min = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if(min > arr[index]) {
				min = arr[index];
			}
		}
		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if(max < arr[index]) {
				max = arr[index];
			}
		}
		return new int[] {min, max};
	}
	
	
}
