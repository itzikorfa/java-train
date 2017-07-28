import java.util.Scanner;

public class Hi_World {

	public static void main(String[] args) {

		// basic opertions
		System.out.println("Hi how are you? ");
		int count = 0;
		char ans = 'a';
		String hi = "bla bla";
		System.out.println(hi + ans + count);
		String name = "john";
		int age = 9;
		 // printing to console
		System.out.println("Hi "+ name + " the meal as arrived");
		System.out.printf("Hi %s the meal as arrived\n", name);
		String test = String.format("Hi %s %d the meal as arrived", name,age);
		System.out.println(test);

		/*
		getting input from user
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name: ");
		String name1 = sc.next();
		System.out.println("enter your age: ");
		float age1 = sc.nextFloat();
		System.out.printf("Hi %s (%.2f)", name1, age1);
		sc.close();
	}
}
