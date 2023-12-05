package com.arrays.problems;

public class FlippingAnImage {
	public static void main(String[] args) {
		int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		for (int[] i : flipAndInvertImage(image)) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static int[][] flipAndInvertImage(int[][] image) {
		int[][] resultArray = new int[image.length][image.length];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = flipArray(image[i]);
		}
		return resultArray;
	}

	static int[] flipArray(int[] arrayRow) {
		int resultArray[] = new int[arrayRow.length];
		int index = 0;
		for (int i = arrayRow.length - 1; i >= 0; i--) {
			resultArray[index] = arrayRow[i];
			index++;
		}
		return invertArray(resultArray);
	}

	static int[] invertArray(int[] arrayRow) {
		for (int i = 0; i < arrayRow.length; i++) {
			arrayRow[i] = (arrayRow[i] == 0) ? 1 : 0;
		}
		return arrayRow;
	}
}
