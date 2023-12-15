package com.skillstorm;

public class Test2 {

	/*
	 * PROBLEM 2:
	 * 
	 * BEFORE RUNNING
	 * 1. Test 2 will not compile and run.
	 * 2. It will not print anything.
	 * 3. It will fail due to the relationships between the super and sub class.
	 * 4. The relationship between a super and sub class in polymorphism should
	 *    be is-a. So, a rose is a flower, but a flower is not necessarily a rose.
	 *    The first constructor violates this relationship.
	 * 
	 * AFTER RUNNING
	 * 1. Same as before running
	 * 2. Same as before running
	 * 3. The result in the console says there is a type mismatch.
	 * 4. Just as the exception suggests, the compiler cannot convert 
	 *    a flower to a rose because rose is a subclass of flower.
	 *    Otherwise, if I comment out the invalid constructor, the rose-is-a-flower
	 *    constructor works just fine.
	 */
	
    public static void main(String[] args) {
//        Rose sunflower = new Flower("yellow", "sunflower");
        Flower rose = new Rose("pink", "heirloom", false);
//        sunflower.smell();
        rose.smell();
    }

}