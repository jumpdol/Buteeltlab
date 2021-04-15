package lab1;

import java.util.HashMap;
import java.util.Scanner;

public class Circle {

	private static final double PI = 3.14;
	double radius;
	static Scanner in = new Scanner(System.in);
	private static HashMap<String, String> circleHash = new HashMap<String, String>();

	public Circle(double radius) {
		this.radius = radius;
	}

	public void printMenu() {
		System.out.println("Та дараах цэснээс сонгон уу");
		System.out.println("1. Тойргийн талбай олох");
		System.out.println("2. Тойргийн хүрээний урт олох");
		System.out.println("3. Тойргийн диаметр олох");
		System.out.println("4. Шинэ радиус оруулах");
		System.out.println("5. Олсон талбай, радиус болон хүрээний уртыг харах");
		System.out.println("6. Таны олсон бүх параметрийг хэвлэх");
		int menu = in.nextInt();
		switch (menu) {
		case 1:
			findArea();
			break;
		case 2:
			findPerimiter();
			break;
		case 3:
			findDeameter();
			break;
		case 4:
			newRadius();
			break;
		case 5:
			seeAreaAndPerimeter();
			break;
		case 6:
			seeMap();
			break;
		default:
			printMenu();
			break;
		}

	}

	public void findArea() {
		String areaText = "areaText";
		System.out.println(areaText);
		String area = String.valueOf(radius * radius * PI);
		System.out.println(area);
		circleHash.put(areaText, area);
		printMenu();

	}

	public void findPerimiter() {
		String perimeterText = "perimeterText";
		System.out.println(perimeterText);
		String perimeter = String.valueOf(2 * PI * radius);
		System.out.println(perimeter);
		circleHash.put(perimeterText, perimeter);
		printMenu();
	}

	public void findDeameter() {
		String deameterText = "deameterText";
		System.out.println(deameterText);
		String deameter = String.valueOf(radius * 2);
		System.out.println(deameter);
		circleHash.put(deameterText, deameter);
		printMenu();
	}

	public void newRadius() {
		System.out.println("Enter your new circle's radius:");
		double radius = in.nextDouble();
		this.radius = radius;
		circleHash.clear();
		printMenu();
	}

	public void seeAreaAndPerimeter() {
		System.out.println("Area: " + circleHash.get("areaText") + " Perimeter: " + circleHash.get("perimeterText"));
		printMenu();
	}

	public void seeMap() {
		if (circleHash.isEmpty()) {
			System.out.println("Та одоогоор тойргийн юуг ч олоогүй байна");
		} else {
			System.out.println(circleHash);
		}
		printMenu();
	}

}
