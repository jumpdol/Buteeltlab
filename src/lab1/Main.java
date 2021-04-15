package lab1;

import java.util.Scanner;


public class Main {
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------");
		System.out.println("CircleCalc v1.0");
		System.out.println();
		System.out.println("Calculates and prints information for a user-supplied radius");
		System.out.println("------------------------------------------------------------");
		System.out.print("Enter the circle's radius: ");
		double radius = in.nextDouble();
		Circle circle = new Circle(radius);
		circle.printMenu();
		// TODO: compute and print the circumference and area of the circle
	}

}
