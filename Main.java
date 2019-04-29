import java.util.*;
import java.util.Random; //import statements

/** This is my wild card for my ENGL1102 portfolio. 
 * This class file prints out various Flannery O'Connor/John Updike Quotes, including my favorites from the two. */
public class Main {

	static String[] flanOConnor = new String[11];
	static String[] johnUpdike = new String[11]; // Instance Variables
	/**  The main method that is responsible for running the code. */
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		addJQuotes(johnUpdike);
		addFQuotes(flanOConnor);
		System.out.println("Hello, welcome to my portfolio wild card!");
		while (true) { //while loop to keep looping until user wants to quit program
			System.out.println("\n" + "What would you like to do?");
			options();
			String userInput = null;
			userInput = user.nextLine();
			inputCheck(userInput);
		}
	}

	/** This checks the input of the user to determine which action to perform.*/
	public static void inputCheck(String s) {
		if (s.equals("jq")) { // 
			printJohn();

		}

		if (s.equals("fq")) {
			printFlan();

		}
		if (s.equals("fjq")) {
			System.out.println(johnUpdike[10] + "\t " + "-John Updike");
			System.out.print("\n");
		}

		if (s.equals("ffq")) {
			System.out.println(flanOConnor[10] + "\t" + "-Flannery O'Connor");
			System.out.print("\n");

		}
		if (s.equals("q")) {
			System.out.println("Goodbye!!");
			System.exit(0);
		}

	}
	
	/** Adds John Updike quotes to the johnUpdike String array object. */
	public static void addJQuotes(String[] j) {
		j[0] = "Belief, like love, must be voluntary.";
		j[1] = "For male and female alike, the bodies of the other sex are messages signaling what we must do, they are glowing signifiers of our own necessities.";
		j[2] = "The writer must face the fact that ordinary lives are what most people live most of the time, and that the novel as a narration of the fantastic and the adventurous is really an escapist plot; that aesthetically, the ordinary, the banal, is what you must deal with.";
		j[3] = "It's so hard to make a good tee shot after a birdie.";
		j[4] = "It's sort of good to see your vocation as a daily task and have fairly modest expectations for financial or reward in other coin - glory, love, whatever.";
		j[5] = "A leader is one who, out of madness or goodness, volunteers to take upon himself the woe of the people. There are few men so foolish, hence the erratic quality of leadership in the world.";
		j[6] = "We take our bearings, daily, from others. To be sane is, to a great extent, to be sociable.";
		j[7] = "I was an only child. I needed an alternative to family life - to real life, you could almost say - and cartoons, pictures in a book, the animated movies, seemed to provide it.";
		j[8] = "To be a human being is to be in a state of tension between your appetites and your dreams, and the social realities around you and your obligations to your fellow man.";
		j[9] = "Professionalism in art has this difficulty: To be professional is to be dependable, to be dependable is to be predictable, and predictability is esthetically boring - an anti-virtue in a field where we hope to be astonished and startled and at some deep level refreshed.";
		j[10] = "Rain is grace; rain is the sky descending to the earth; without rain, there would be no life.";
		//Source for quotes: https://www.brainyquote.com/authors/john_updike
	}
	
	/** Adds Flannery O'Connor quotes to the flanOConnor String array object. */
	public static void addFQuotes(String[] f) {
		f[0] = "There's many a bestseller that could have been prevented by a good teacher.";
		f[1] = "When a book leaves your hands, it belongs to God. He may use it to save a few souls or to try a few others, but I think that for the writer to worry is to take over God's business.";
		f[2] = "To expect too much is to have a sentimental view of life and this is a softness that ends in bitterness.";
		f[3] = "I find that most people know what a story is until they sit down to write one.";
		f[4] = "Faith is what someone knows to be true, whether they believe it or not.";
		f[5] = "Conviction without experience makes for harshness.";
		f[6] = "When in Rome, do as you done in Milledgeville.";
		f[7] = "I am a writer because writing is the thing I do best.";
		f[8] = "The writer can choose what he writes about but he cannot choose what he is able to make live.";
		f[9] = "Writing a novel is a terrible experience, during which the hair often falls out and the teeth decay.";
		f[10] = "The basis of art is truth, both in matter and in mode.";
		//Source for quotes: https://www.brainyquote.com/authors/flannery_oconnor
	}
	
	/** Prints out a random Flannery O'Connor quote from the flanOConnor String array. */
	public static void printFlan() {
		Random randomInt = new Random();
		int num = Math.abs(randomInt.nextInt() % 11);
		System.out.println(flanOConnor[num] + "\t" + "-Flannery O'Connor");
		System.out.print("\n");
	}
	
	/** Prints out a random John Updike quote from the johnUpdike String array.*/
	public static void printJohn() {
		Random randomInt = new Random();
		int num = Math.abs(randomInt.nextInt() % 11);
		System.out.println(johnUpdike[num] + "\t" + "-John Updike");
		System.out.print("\n");
	}

	/** Lists out the users options! */
	public static void options() {
		System.out.print("\n");
		System.out.print("Type in the characters given in the parenthesis to get quotes!");
		System.out.print("\n");
		System.out.print("Flannery O'Connor Quotes!(fq)" + "\t" + "Favorite Flannery O'Connor Quote! (ffq)" + "\n");
		System.out.print("John Updike Quotes!(jq)" + "\t" + "\t" + "Favorite John Updike Quote! (fjq)" + "\t" + "\n"
				+ "Quit!(q)");
	}
}
