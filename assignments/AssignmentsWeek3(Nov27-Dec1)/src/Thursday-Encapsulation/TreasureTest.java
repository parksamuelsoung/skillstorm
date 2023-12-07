package com.skillstorm;

import java.util.Arrays;

public class TreasureTest {

	public static void main(String[] args) {
		Treasure treasure1 = new Treasure("Ring", "18K Gold", 419.99);
		Treasure treasure2 = new Treasure("Broach", "20K White Gold", 984.00);
		Treasure treasure3 = new Treasure("Stone", "Sapphire Diamond", 22436.00);
		
		Treasure[] treasures = {treasure1, treasure2, treasure3};
		TreasureChest treasureChest1 = new TreasureChest(25.0, 16.0, 18.0, 24.0, true, treasures);
		TreasureChest treasureChest2 = new TreasureChest(25.0, 16.0, 18.0, 24.0, false, treasures);
		
		treasureChest1.setLocked(true);
		System.out.println(treasureChest1);
		System.out.println(Arrays.toString(treasureChest1.getContents()));
		
		System.out.println();
		
		treasureChest2.setLocked(false);
		System.out.println(treasureChest2);
		for (Treasure treasure : treasureChest2.getContents()) {
			System.out.println(treasure);
		}
		
	}
}
