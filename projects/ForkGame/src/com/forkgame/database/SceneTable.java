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
						"a", "0a-ones",
						"Mission Impeccable\n",
						"Start Game\n",
						"a) start now"),
				new Scene(sceneId++, 0, 0,
						"a", "1a-ones-random",
						"Spaghetti and Meatballs\n",
						"You were left in a bowl of spagetti leftovers.\n" +
						"Your host family is sound asleep now.\n",
						"a) shake off the spaghetti\n" +
						"b) keep it on, nice hairdo"),
				new Scene(sceneId++, 0, 0,
						"a", "1b-ones-random",
						"Thanksgiving Dinner\n",
						"You are buried in a plate of Thanksgiving leftovers.\n" +
						"Your host family is sound asleep now.\n",
						"a) shake off the turkey\n" +
						"b) keep him on, nice hairdo"),
				new Scene(sceneId++, 0, 0,
						"a", "1c-ones-random",
						"Happy Birthday!\n",
						"You were left in a piece of icecream birthday cake.\n" +
						"Your host family is sound asleep now.\n",
						"a) shake off the cake\n" +
						"b) keep it on, nice hairdo"),
				new Scene(sceneId++, 1, -1,
						"ab", "2a-ones",
						"Shook It Off\n",
						"You are still on top of the dining table.\n" +
						"You need to get down and start your mission.\n",
						"a) use the chair to lower yourself\n" +
						"b) jump directly onto the floor\n" +
						"c) use a tissue as a parachute"),
				new Scene(sceneId++, 0, 1,
						"ab", "2b-ones",
						"Nice Hairdo\n",
						"You are still on top of the dining table.\n" +
						"You need to get down and start your mission.\n",
						"a) use the chair to lower yourself\n" +
						"b) jump directly onto the floor\n" +
						"c) use a tissue as a parachute"),
				new Scene(sceneId++, 0, 0,
						"abc", "3a-ones",
						"Politely Came Down\n",
						"You are on the ground.\n" +
						"You came down right into the family dog's sight.\n",
						"a) confront him\n" +
						"b) persuade him\n" +
						"c) freeze and play possum\n" +
						"d) runaway"),
				new Scene(sceneId++, 0, -1,
						"abc", "3b-ones",
						"Clink, Clink, Ouch!\n",
						"You are on the ground.\n" +
						"You came down right into the family dog's sight.\n",
						"a) confront him\n" +
						"b) persuade him\n" +
						"c) freeze and play possum\n" +
						"d) runaway"),
				new Scene(sceneId++, 0, 1,
						"abc", "3c-ones",
						"James Bond Style\n",
						"You are on the ground.\n" +
						"You came down right into the family dog's sight.\n",
						"a) confront him\n" +
						"b) persuade him\n" +
						"c) freeze and play possum\n" +
						"d) runaway"),
				new Scene(sceneId++, 0, -1,
						"abcd", "4a-ones",
						"GG\n",
						"Well, you tried.\n" +
						"But, now he has a new chew toy.\n",
						"a) next"),
				new Scene(sceneId++, 1, 1,
						"abcd", "4b-ones",
						"Insider Spy\n",
						"He took your bait and is taking you somewhere.\n" +
						"It could be a trap.\n",
						"a) next"),
				new Scene(sceneId++, 0, 1,
						"abcd", "4c-ones",
						"Play Possum\n",
						"He just picked you up on the side of the road.\n" +
						"He's taking you somewhere.\n",
						"a) next"),
				new Scene(sceneId++, 0, 0,
						"abcd", "4d-ones",
						"Run Away!\n",
						"Did you forget? He loves to fetch.\n" +
						"He's taking you somewhere now.\n",
						"a) next"),
				new Scene(sceneId++, 0, 0,
						"a", "5a-ones",
						"Bonus Round!\n",
						"Answer correctly to rack up more stealth points.\n" +
						"Which Toy Story movie did Forky make his first appearance?\n",
						"a) 1\n" +
						"b) 2\n" +
						"c) 3\n" +
						"d) 4"),
				new Scene(sceneId++, 0, 0,
						"abcd", "6a-ones",
						"Wrong Answer\n",
						"The answer is Toy Story 4.\n" +
						"No points were lossed or gained.\n",
						"a) let's get back to the dog ride"),
				new Scene(sceneId++, 0, 0,
						"abcd", "6b-ones",
						"Wrong Answer\n",
						"The answer is Toy Story 4.\n" +
						"No points were lossed or gained.\n",
						"a) let's get back to the dog ride"),
				new Scene(sceneId++, 0, 0,
						"abcd", "6c-ones",
						"Wrong Answer\n",
						"The answer is Toy Story 4.\n" +
						"No points were lossed or gained.\n",
						"a) let's get back to the dog ride"),
				new Scene(sceneId++, 0, 2,
						"abcd", "6d-ones",
						"Correct!\n",
						"Yes, Forky was introduced in Toy Story 4.\n" +
						"You gained two extra stealthiness points!\n",
						"a) let's get back to the dog ride"),
				new Scene(sceneId++, -1, 1,
						"a", "7a-ones-random",
						"Gotta Save Treats!\n",
						"He buried you in the backyard and left.\n" +
						"But, you're all dirty now.\n",
						"a) let's go to the kitchen"),
				new Scene(sceneId++, 1, 0,
						"a", "7b-ones-random",
						"The Best Source of Water\n",
						"He went to the toilet to get a drink. Oops, plunk!\n" +
						"He left, and you look a bit cleaner now.\n",
						"a) go to the kitchen"),
				new Scene(sceneId++, 0, 0,
						"a", "7c-ones-random",
						"Oh, Squirrel!\n",
						"There is saw a squirrel on the window sill.\n" +
						"He got distracted and left you on the dining room floor.\n",
						"a) go to the kitchen"),
				new Scene(sceneId++, 0, -1,
						"a", "8a-ones",
						"The Kitchen\n",
						"Time is ticking.\n" +
						"Your host family is about to wake up soon.\n",
						"a) too late, do nothing\n" +
						"b) wash yourself in the sink\n" +
						"c) run the dishwasher\n" +
						"d) at least make it to the drawer organizer\n" +
						"e) special mystery move"),
				new Scene(sceneId++, 0, -1,
						"abcde", "9a-ones",
						"I Shall Do Nothing\n",
						"Your host family woke up.\n" +
						"They find their new fork lying on the kitchen floor.\n",
						"a) end game"),
				new Scene(sceneId++, 3, 3,
						"abcde", "9b-ones",
						"The Old Fashioned Way\n",
						"Your host family woke up.\n" +
						"They find their new fork in the sink.\n",
						"a) end game"),
				new Scene(sceneId++, 5, 5,
						"abcde", "9c-ones",
						"Technology Is Great\n",
						"Your host family woke up.\n" +
						"Right on time! The drying cycle just finished.\n",
						"a) end game"),
				new Scene(sceneId++, 0, 1,
						"abcde", "9d-ones",
						"At Least Be Organized\n",
						"Your host family woke up.\n" +
						"They find their new fork in the silverware organizer.\n",
						"a) end game"),
				new Scene(sceneId++, -5, -5,
						"abcde", "9e-ones",
						"Toy Story 4.\n",
						"Think - What would Forky do?\n" +
						"You were found hiding in the trash.\n",
						"a) end game"),
				new Scene(sceneId++, 0, 0,
						"a", "10a-last",
						"The End\n",
						"",
						"Player Information")
				);
	}
	
	public ArrayList<Scene> getScenes() {
		return scenes;
	}
	

}
