import java.util.Scanner;

public class FINALBenchmark3 {
	public static void main(String[] args) {
		System.out.println(
				"Let’s start your adventure! What you choose will determine your ending. Your goal is to find the Lost Treasure.");
		playerNameFreeResponseScene();
		firstScene();
	}

	// Free response. This one is asking for your name:
	public static void playerNameFreeResponseScene() {
		System.out.println("But first, what is your name?");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		System.out.println("Hello " + name + "!");
	}

	// The player's first choice. They can choose between the haunted mansion or the
	// tunnel.
	public static void firstScene() {
		String input = getUserInput(
				"You are just starting your journey. To the left of you there is a haunted mansion. "
						+ "To the right there is a tunnel.\n" + "-> Click '1' to go left.\n"
						+ "-> Click '2' to go right.\n");

		if (input.equalsIgnoreCase("1")) {
			hauntedMansionScene();
		} else if (input.equalsIgnoreCase("2")) {
			tunnelScene();
		} else {
			System.out.println("Invalid input. Please try again");
			firstScene();
		}
	}

	// If the player chooses the haunted mansion, this is their first choice. There
	// are some stairs. The player
	// can choose to go up or down.
	public static void hauntedMansionScene() {
		String input = getUserInput("You’re going to the haunted mansion!\nYou're in the haunted mansion. "
				+ "There are some stairs. You can either go up or down. Which way do you want to go\n"
				+ "-> Click '1' to go up\n" + "-> Otherwise click '2' to go down\n");
		if (input.equalsIgnoreCase("1")) {
			topOfStairs();
		} else if (input.equalsIgnoreCase("2")) {
			bottomOfStairs();
		} else {
			System.out.println("Invalid input. Please try again");
			hauntedMansionScene();
		}
	}

	// Top of the stairs in the haunted mansion. There are some door choices.
	// The player will choose one. Two of them go to the next scene, but one goes
	// back to the start
	public static void topOfStairs() {
		String input = getUserInput("Great! Let’s see what’s at the top\nYou made it to the top! Great job!\n"
				+ "Here you find three doors. They are all different colors. You have three options.\n"
				+ "One of these door will make you return to the start! Your choices are:\n" + "- the Yellow Door\n"
				+ "- the Black Door\n" + "- the Purple Door\n"
				+ "The above doors are you're choices. Which one will it be?\n" + "-> '1' for the black door,\n "
				+ "-> '2' for the purple door.\n" + "" + "-> Click '3' for the yellow door,");
		if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2")) {
			doorExit();
		} else if (input.equalsIgnoreCase("3")) {
			System.out.println("Looks like you're back at the start!");
			firstScene();
		} else {
			System.out.println("Invalid input. Please try again");
			topOfStairs();
		}

	}

	// Bottom of the stairs in the haunted mansion. The player falls on the stairs
	// and dies. END
	public static void bottomOfStairs() {
		System.out.println("Great! Let's see what's at the bottom\n Oh no! "
				+ "The steps were broken. It got darker as you went down the steps so you couldn’t see and you fell through the hole! You died :(");
	}

	// If the player chooses the tunnel this is their first tunnel choice. There are
	// two trapdoors. One going up and one going
	// down. The player will choose one.
	public static void tunnelScene() {
		String input = getUserInput("You’re going into the tunnel!\n" + "The tunnel was a dead end!\n"
				+ "But when you turned around to go the entrance got blocked by a bunch of boulders.\n"
				+ "You have two options. There is a trapdoor on the top and bottom.\n" + "-> Click '1' to go up.\n"
				+ "-> Otherwise '2' go down\n");
		if (input.equalsIgnoreCase("1")) {
			topOfTrapdoor();
		} else if (input.equalsIgnoreCase("2")) {
			bottomOfTrapdoor();
		} else {
			System.out.println("Invalid input. Please try again");
			tunnelScene();
		}
	}

	// If the player chose the trapdoor that goes up, they end up in
	// a greenhouse. The player will choose a flower.
	public static void topOfTrapdoor() {
		String input = getUserInput("Great! Let’s see what you will find at the top! "
				+ "You have exited the trapdoor to find yourself in a greenhouse.\n"
				+ "There are two flowers to choose from. A tulip and a rose.\n"
				+ "Since no one is around and just for fun, which one do you want to choose?\n"
				+ "-> Click '1' for the tulip.\n" + "-> Click '2' for the rose");
		if (input.equalsIgnoreCase("1")) {
			System.out.println("Your tulip looks beautiful!");
			doorExit();
		} else if (input.equalsIgnoreCase("2")) {
			System.out.println("Your rose looks beautiful!");
			doorExit();
		} else {
			System.out.println("Invalid input. Please try again");
			topOfTrapdoor();
		}
	}

	// If the player chose the trapdoor that goes down,
	// they end up in a lava pit and they die. END
	public static void bottomOfTrapdoor() {
		System.out.println(
				"Great! Let's see what you will find at the bottom!\nOh no! Going down led to a lava pit! You died :(");
	}

	// The player has exited either the greenhouse door from the tunnel path, or the
	// black or purple door from the haunted house path.
	// The player now gets to choose either a cat or a dog to accompany them on the
	// rest of their journey.
	public static void doorExit() {
		String input = getUserInput("You exited the door to find yourself outside. There is an old abandoned hut.\n"
				+ "Inside you find a dog and a cat. Which one do you want?\n" + "-> Click '1' for the dog.\n"
				+ "-> Click '2' to choose the cat.");
		if (input.equalsIgnoreCase("1")) {
			System.out.println("Great! This animal will acompany you on your journey!");
			villageNightChoice();
		} else if (input.equalsIgnoreCase("2")) {
			System.out.println("Great! This animal will acompany you on your journey!");
			villageNightChoice();
		} else {
			System.out.println("Invalid input. Please try again");
			doorExit();
		}

	}

	// The player has entered a village. Here they can either choose some food or a
	// tent. Then later it will get dark and the player will have to choose how they
	// will take shelter for the night.
	// They can either choose to go to the forest, or the inn.
	// Based on the supplies they chose at the village and the place they decide to
	// spend the night, they will either die or survive.
	public static void villageNightChoice() {
		String suppliesInput = getUserInput(
				"After walking for sometime you enter a small village. You can either choose to get a tent or some food.\n"
						+ "But you only have enough money for one.Which one will you choose?\n"
						+ "-> Click '1' for food.\n" + "-> Click '2' for the tent\n");
		if (suppliesInput.equalsIgnoreCase("1")) {
			System.out.println("Good choice! Now you won’t starve to death! Just don’t eat it all at once");
		} else if (suppliesInput.equalsIgnoreCase("2")) {
			System.out.println("Good choice! The tent will come in handy when you need a shelter");
		} else {
			System.out.println("Invalid input. Please try again");
			villageNightChoice();
		}

		String pathInput = getUserInput("You’re walking along and you realize that it’s getting dark.\n"
				+ "You look up to see gray clouds forming meaning it will probably rain soon. There are two paths.\n"
				+ "One leads to the woods. There are some threats in the woods. But if you have a good shelter you just need to find food.\n"
				+ "The other path leads to a cabin that’s an inn. You don’t know if you will have enough money for it especially after buying your supplies but if you don’t have a shelter this might be your only option.\n"
				+ "Think about your supplies and choose wisely.\n" + "-> Click '1' to go to the woods.\n"
				+ "-> Click '2' to go to the inn");
		if (suppliesInput.equalsIgnoreCase("1") && pathInput.equalsIgnoreCase("1")) {
			System.out.println("You died. You had food but you didn’t have a shelter.\n"
					+ "You froze in the rain and the food attracted some hungry bears nearby... :(");
		} else if (suppliesInput.equalsIgnoreCase("1") && (pathInput.equalsIgnoreCase("2"))) {
			System.out.println(
					"Even though you were only able to pay for the room at the inn and not the food, it was okay because you had your own!\n"
							+ "You were able to chill and eat while you waited for the storm to pass. You survived!");
			saveOrStealChoice();
		} else if (pathInput.equalsIgnoreCase("1") && (suppliesInput.equalsIgnoreCase("2"))) {
			System.out.println("You were able to set up your tent in the woods and wait out the storm.\n"
					+ "You found an apple tree full of ripe apples. Your still a little bit hungry but you survived!");
			saveOrStealChoice();
		} else if (pathInput.equalsIgnoreCase("2") && (suppliesInput.equalsIgnoreCase("2"))) {
			System.out.println("You died. You were able to pay for a room but not for the food!\n"
					+ "You had a tent which became useless inside the inn. There was a garden at the inn.\n"
					+ "There was a bush full of berries outside but they weren’t ripe.\n"
					+ "Even though you knew you shouldn’t eat unripe berries you were desperate and ate too many unripe berries and died. :(");
		} else {
			System.out.println("Invalid input. Please try again");
			villageNightChoice();
		}

	}

	// Here the player meets a man who is tied up to a tree. They will have two
	// choices. They can either untie him and save him,
	// or steal his belongings and leave him. If they untie him, they will die. But
	// if they steal his things, they will survive.
	public static void saveOrStealChoice() {
		String input = getUserInput(
				"Let's continue your journey! As you are walking along you see a man. He is tied up to a tree.\n"
						+ "As you get closer he asks you to save him. Next to him is a broken cart which you can assume is his.\n"
						+ "There is a sleeping potion and a dagger.\n"
						+ "You can either steal those things and leave the man, or you can untie him and save him.\n"
						+ "-> Click '1' to untie the man.\n" + "-> Click '2' to steal the items");
		if (input.equalsIgnoreCase("1")) {
			System.out.println("You died! The man tricked you and stabbed you after you untied him. :(");
		} else if (input.equalsIgnoreCase("2")) {
			System.out.println(
					"Good choice. Right after you took the items from the cart, two people came and dragged the man away.\n"
							+ "Turns out, he is a criminal.");
			daggerOrPotionChoice();
		} else {
			System.out.println("Invalid input. Please try again");
			saveOrStealChoice();
		}

	}

	public static void daggerOrPotionChoice() {
		String input = getUserInput(
				"After some walking you have reached the golden temple where the Lost Treasure is located.\n"
						+ "The door to the temple is locked. All of a sudden you hear footsteps.\n"
						+ "You follow your instinct and hide behind one of the statues near the temple.\n"
						+ "Someone comes around the corner in what looks like a uniform.\n"
						+ "From a distance you make your way around the temple and see that there are more of these people surrounding the other doors of the temple.\n"
						+ "It looks like these people are guarding the temple. You can use your dagger or your sleeping potion that you took from the man to get inside the temple.\n"
						+ "-> Click '1' to choose the potion.\n" + "-> Click any '2' to choose the dagger.");
		if (input.equalsIgnoreCase("1")) {
			System.out.println(
					"You see the guard left his water bottle next to his post while he goes to check the other door.\n"
							+ "You take your chance and pour the sleeping potion into his water bottle. He drinks it and falls asleep. "
							+ "You go through.\n");
			emeraldOrDiamondChoice();
		} else if (input.equalsIgnoreCase("2")) {
			System.out.println("You to go attack the guard with your dagger but your not quick enough and\n"
					+ "the guard triggers an alarm you didn’t know about. You got caught. You died :(\n");
		} else {
			System.out.println("Invalid input. Please try again");
			daggerOrPotionChoice();
		}

	}

	public static void emeraldOrDiamondChoice() {
		String input = getUserInput(
				"You found the treasure. There is a diamond or an emerald. You can only take one. Which one do you want?\n"
						+ "-> Click '1' to choose the diamond.\n" + "-> Click '2' to choose the emerald\n");
		if (input.equalsIgnoreCase("1")) {
			System.out.println("Nice diamond! :)");
			escapeChoice();
		} else if (input.equalsIgnoreCase("2")) {
			System.out.println("Nice emerald! :)");
			escapeChoice();

		} else {
			System.out.println("Invalid input. Please try again");
			emeraldOrDiamondChoice();
		}
	}

	public static void escapeChoice() {
		String input = getUserInput("Choose your way home. Hot air balloon or private jet.\n"
				+ "-> Click '1' to choose Hot air balloon.\n" + "-> Otherwise click '2' to choose the private jet");
		if (input.equalsIgnoreCase("1")) {
			System.out.println("Congratulations! You did it! Hope you hade fun!");
			feedbackFreeResponseScene();
		} else if (input.equalsIgnoreCase("2")) {
			System.out.println("Congratulations! You did it! Hope you had fun!");
			feedbackFreeResponseScene();
		} else {
			System.out.println("Invalid input. Please try again");
			escapeChoice();
		}

	}

	public static void feedbackFreeResponseScene() {
		String feedback = getUserInput("Give us some feedback on this game! Tell us, did you like it or not?");
		System.out.println("Your feedback: " + "-> " + feedback + " <-" + " Thanks for telling us. Bye! :)");

	}

	public static String getUserInput(String one) {
		System.out.println(one);
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		return input;

	}

}