package lab2;

import java.util.Scanner;

public class Circle {

	private static final double PI = 3.14;
	double radius;
	MyMap circleHash = new MyMap();
	static Scanner in = new Scanner(System.in);

	public Circle(double radius) {
		this.radius = radius;
	}

	public void printMenu() {
		circleHash.put("radius", String.valueOf(radius));
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
		String areaText = "area :";
		System.out.print(areaText);
		String areaItem = String.valueOf(radius * radius * PI);
		System.out.println(areaItem);
		circleHash.put("area", areaItem);
		printMenu();

	}

	public void findPerimiter() {
		String perimeterText = "perimeter :";
		System.out.print(perimeterText);
		String perimeterItem = String.valueOf(2 * PI * radius);
		System.out.println(perimeterItem);
		circleHash.put("peremeter", perimeterItem);
		printMenu();
	}

	public void findDeameter() {
		String deameterText = "deameter: ";
		System.out.print(deameterText);
		String deameterItem = String.valueOf(radius * 2);
		System.out.println(deameterItem);
		circleHash.put("deameter", deameterItem);
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
		System.out.println("Area: " + circleHash.get("area") + " Perimeter: " + circleHash.get("peremeter"));
		printMenu();
	}

	public void seeMap() {
		System.out.println("Radius: " + circleHash.get("radius"));
		System.out.println("Perimeter: " + circleHash.get("peremeter"));
		System.out.println("Deameter: " + circleHash.get("deameter"));
		System.out.println("Area: " + circleHash.get("area"));
		

		printMenu();
	}

}
