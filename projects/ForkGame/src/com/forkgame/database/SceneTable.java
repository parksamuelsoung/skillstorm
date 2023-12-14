package com.forkgame.database;

import java.util.ArrayList;
import java.util.Collections;

import com.forkgame.models.Scene;

public class SceneTable {
	
	private ArrayList<Scene> scenes = new ArrayList<>();
	private int sceneId;
	
	{
		Collections.addAll(scenes,
				new Scene(sceneId++, 0, 0,
						"a", "0a",
						"Mission Impeccable\n",
						"Start Game\n",
						"a) start now"),
				new Scene(sceneId++, 0, 0,
						"a", "1a-random",
						"Spaghetti and Meatballs\n",
						"You were left in a bowl of spagetti leftovers.\n" +
						"Your host family is sound asleep now.\n",
						"a) shake off the spaghetti\n" +
						"b) keep it on, nice hairdo"),
				new Scene(sceneId++, 0, 0,
						"a", "1b-random",
						"Thanksgiving Dinner\n",
						"You are buried in a plate of Thanksgiving leftovers.\n" +
						"Your host family is sound asleep now.\n",
						"a) shake off the turkey\n" +
						"b) keep him on, nice hairdo"),
				new Scene(sceneId++, 0, 0,
						"a", "1c-random",
						"Happy Birthday!\n",
						"You were left in a piece of icecream birthday cake.\n" +
						"Your host family is sound asleep now.\n",
						"a) shake off the cake\n" +
						"b) keep it on, nice hairdo"),
				new Scene(sceneId++, 1, -1,
						"ab", "2a",
						"Shook It Off\n",
						"You are still on top of the dining table.\n" +
						"You need to get down and start your mission.\n",
						"a) use the chair to lower yourself\n" +
						"b) jump directly onto the floor\n" +
						"c) use a tissue as a parachute"),
				new Scene(sceneId++, 0, 1,
						"ab", "2b",
						"Nice Hairdo\n",
						"You are still on top of the dining table.\n" +
						"You need to get down and start your mission.\n",
						"a) use the chair to lower yourself\n" +
						"b) jump directly onto the floor\n" +
						"c) use a tissue as a parachute"),
				new Scene(sceneId++, 0, 0,
						"abc", "3a",
						"Politely Came Down\n",
						"You are on the ground.\n" +
						"You came down right into the family dog's sight.\n",
						"a) confront him\n" +
						"b) persuade him\n" +
						"c) freeze and play possum\n" +
						"d) runaway"),
				new Scene(sceneId++, 0, -1,
						"abc", "3b",
						"Clink, Clink, Ouch!\n",
						"You are on the ground.\n" +
						"You came down right into the family dog's sight.\n",
						"a) confront him\n" +
						"b) persuade him\n" +
						"c) freeze and play possum\n" +
						"d) runaway"),
				new Scene(sceneId++, 0, 1,
						"abc", "3c",
						"James Bond Style\n",
						"You are on the ground.\n" +
						"You came down right into the family dog's sight.\n",
						"a) confront him\n" +
						"b) persuade him\n" +
						"c) freeze and play possum\n" +
						"d) runaway"),
				new Scene(sceneId++, 0, -1,
						"abcd", "4a",
						"GG\n",
						"Well, you tried.\n" +
						"But, now he has a new chew toy.\n",
						"a) next"),
				new Scene(sceneId++, 1, 1,
						"abcd", "4b",
						"Insider Spy\n",
						"He took your bait and is taking you somewhere.\n" +
						"It could be a trap.\n",
						"a) next"),
				new Scene(sceneId++, 0, 1,
						"abcd", "4c",
						"Play Possum\n",
						"He just picked you up on the side of the road.\n" +
						"He's taking you somewhere.\n",
						"a) next"),
				new Scene(sceneId++, 0, 0,
						"abcd", "4d",
						"Run Away!\n",
						"Did you forget? He loves to fetch.\n" +
						"He's taking you somewhere now.\n",
						"a) next"),
				new Scene(sceneId++, -1, 1,
						"a", "5a-random",
						"Gotta Save Treats!\n",
						"He buried you in the backyard and left.\n" +
						"But, you're all dirty now.\n",
						"a) go to the kitchen"),
				new Scene(sceneId++, 1, 0,
						"a", "5b-random",
						"The Best Source of Water\n",
						"He went to the toilet to get a drink. Oops, plunk!\n" +
						"He left, and you look a bit cleaner now.\n",
						"a) go to the kitchen"),
				new Scene(sceneId++, 0, 0,
						"a", "5c-random",
						"Oh, Squirrel!\n",
						"There is saw a squirrel on the window sill.\n" +
						"He got distracted and left you on the dining room floor.\n",
						"a) go to the kitchen"),
				new Scene(sceneId++, 0, -1,
						"a", "6a",
						"The Kitchen\n",
						"Time is ticking.\n" +
						"Your host family is about to wake up soon.\n",
						"a) too late, do nothing\n" +
						"b) wash yourself in the sink\n" +
						"c) run the dishwasher\n" +
						"d) at least make it to the drawer organizer"),
				new Scene(sceneId++, 0, -1,
						"abcd", "7a",
						"I Shall Do Nothing\n",
						"Your host family woke up.\n" +
						"They find their new fork lying on the kitchen floor.\n",
						"a) end game"),
				new Scene(sceneId++, 3, 0,
						"abcd", "7b",
						"The Old Fashioned Way\n",
						"Your host family woke up.\n" +
						"They find their new fork in the sink.\n",
						"a) end game"),
				new Scene(sceneId++, 5, 1,
						"abcd", "7c",
						"Technology Is Great\n",
						"Your host family woke up.\n" +
						"Right on time! The drying cycle just finished.\n",
						"a) end game"),
				new Scene(sceneId++, 0, 1,
						"abcd", "7d",
						"At Least Be Organized\n",
						"Your host family woke up.\n" +
						"They find their new fork in the silverware organizer.\n",
						"a) end game"),
				new Scene(sceneId++, 0, 0,
						"a", "8a-last",
						"The End\n",
						"",
						"Player Information")
				);
	}
	
	public ArrayList<Scene> getScenes() {
		return scenes;
	}
	

}
