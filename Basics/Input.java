// Input.java 

import java.util.Scanner; // for take input 

public class Input {
	public static void main(String[] args) {
		// Initiate input 
		Scanner input = new Scanner(System.in);

		// Take a string input 
		System.out.print("Enter your name: ");
		String name = input.nextLine();

		// Take a integer input 
		System.out.print("Enter your age: ");
		int age = input.nextInt();

		// Take a double input 
		System.out.print("Enter your GPA: ");
		double gpa = input.nextDouble();

		// Print all input data 
		System.out.println("Data of user");
		System.out.println("Name        : " + name);
		System.out.println("Age         : " + age + "(" + (age >= 18 ? "Adult" : "Minor") + ")");
		System.out.println("GPA         : " + gpa);

		// Close input system 
		input.close();
	}
}
