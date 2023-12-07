package com.skillstorm;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {

		// Part1 - STEP 1
		int i = 0;
		String[] favoriteFoods = { "bolognaise", "chicken alfredo", "beef stew" };
		System.out.printf("My list of favorite foods are:%n%s%n%s%n%s%n%n", favoriteFoods[i++], favoriteFoods[i++],
				favoriteFoods[i++]);

		// Part1 - STEP 2
		int j = 0;
		favoriteFoods[0] = "bbq ribs";
		favoriteFoods[1] = "shwarmas";
		favoriteFoods[2] = "rice porridge";
		System.out.printf("My updated list of favorite foods are:%n%s%n%s%n%s%n%n", favoriteFoods[j++],
				favoriteFoods[j++], favoriteFoods[j++]);

		// Part1 - STEP 3
		int k = 0;
		favoriteFoods = Arrays.copyOf(favoriteFoods, 5);
		favoriteFoods[3] = "beef stew";
		favoriteFoods[4] = "kimbab";
		System.out.printf("My new list of more favorite foods are:%n%s%n%s%n%s%n%s%n%s%n%n", favoriteFoods[k++],
				favoriteFoods[k++], favoriteFoods[k++], favoriteFoods[k++], favoriteFoods[k++]);

		// Part2 - STEP 2
		int[] test1 = { 1, 2, 3 };
		int[] test2 = { 1 };
		System.out.println(getLastElement(test1));
		System.out.println(getLastElement(test2));

		// Part2 - BONUS
		int[] test3 = {};
		int[] test4 = null;
		System.out.println(getLastElement(test3));
		System.out.println(getLastElement(test4));

	}

	///////////////////////////////////////////////////////////////

	// Part2 - STEP 1

	public static int getLastElement(int[] testArray) {
		if (testArray == null || testArray.length == 0 || Arrays.toString(testArray).isEmpty()) {
			return 0;
		} else {
			return testArray[testArray.length - 1];
		}
	}
	
	// Part2 - STEP 2 and BONUS are above in the main method.

}
