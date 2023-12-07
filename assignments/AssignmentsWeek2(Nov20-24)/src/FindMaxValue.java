package com.skillstorm;

public class FindMaxValue {

	public static void main(String[] args) {

		int[] values = { 4, -3, -2, -1, -5 };

		if (values == null || values.length == 0 || values.length == 1) {
			System.out.println("Input is invalid.");
		} else {
			System.out.println(findMax(values));
			System.out.println(findMin(values));
		}
	}

	public static int findMax(int[] values) {

		int maxVal = values[0];
		for (int val : values) {

			if (val > maxVal) {
				maxVal = val;
			}
		}
		return maxVal;
	}

	public static int findMin(int[] values) {

		int minVal = values[0];
		for (int val : values) {

			if (val < minVal) {
				minVal = val;
			}
		}
		return minVal;
	}

}
