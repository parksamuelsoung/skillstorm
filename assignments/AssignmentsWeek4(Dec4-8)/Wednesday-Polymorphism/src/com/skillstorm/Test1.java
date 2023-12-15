package com.skillstorm;

public class Test1 {

	/*
	 * PROBLEM 1:
	 * 
	 * BEFORE RUNNING
	 * 1. Test 1 will compile and run.
	 * 2. It will print "This pink Damask rose smells good!"
	 * 3. N/A
	 * 4. Method overriding is used with the smell method.
	 * 
	 * AFTER RUNNING
	 * 1. Test 1 will not compile and run.
	 * 2. It does not print anything. 
	 * 3. There is a Unresolved compilation problem where the fields for flower is not visible.
	 * 4. Within the Rose class there is no way for color and name to be accessed.
	 *    A quick fix for this is to create a getter method for color and name in the 
	 *    super class and call super.~ the method for color and name which I implemented. 
	 *    
	 */
	
    public static void main(String[] args) {
        Flower rose1 = new Rose("pink", "Damask", true); 
        rose1.smell();
    }

}