import java.util.Scanner;
import java.util.Random;
public class HeadsOrTails{
    public static void main(String[] args) {
		System.out.println("Who are you?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
        System.out.println("> " + name);
		System.out.println("Hello, " + name + "!");
		Random rand = new Random();
		BodyParts[] bodyParts = new BodyParts[3];
		for (int i = 0; i < bodyParts.length; i++){
			bodyParts[i] = (rand.nextInt(2) == 0) ? new Head() : new Tail();
			System.out.println("Round "  + (i + 1) + ": " + bodyParts[i].getName());
		}
		System.out.println("Heads: " + Head.getCount() + ", Tails: " + Tail.getCount());
    }
}

abstract class BodyParts {
	String name;
    abstract String getName();
}

class Head extends BodyParts {
    private static int count;
	String name = "Heads";
    public Head() {};
    public String getName() {
		increment();
		return name;
    }
    public static void increment() { count++; }
    public static int getCount() { return count; }
}

class Tail extends BodyParts {
    private static int count;
	String name = "Tails";
    public Tail() {};
    public String getName() {
		increment();
		return name;
    }
    public static void increment() { count++; }
    public static int getCount() { return count; }
}