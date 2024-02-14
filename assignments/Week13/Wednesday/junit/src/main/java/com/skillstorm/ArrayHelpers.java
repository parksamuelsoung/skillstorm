package com.skillstorm;

public class ArrayHelpers {
    public static void main(String[] args) {
        System.out.println("Find max method from week 2. \nI added exceptions.");
    }

    public static int findMax(int[] values) {
        int maxVal = values[0];
        try {
            for (int val : values) {
                if (val > maxVal) {
                    maxVal = val;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return maxVal;
	}
}