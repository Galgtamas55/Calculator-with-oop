package calculatoroop;

import java.util.*;

public class DomainApp {
	final static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		do {
			app();
		} while (scan.next().charAt(0) == 'y');
		System.out.println("Bye thanks for used this app");
		scan.close();
	}

	private static void app() throws Exception {
		instruction();
		int choose = scan.nextInt();
		addition(choose);
		subtraction(choose);
		multiplication(choose);
		divisors(choose);
		square(choose);
		involve(choose);
		log(choose);
		log10(choose);
		error(choose);
		System.out.println("Do you want a new calculation? y/n");
	}

	private static void square(int choose) {
		if (choose == 5) {
			System.out.println("Please give one number");
			double x = scan.nextInt();
			Operation square = new Square(x);
			square.printResult();
		}
	}

	private static void divisors(int choose) {
		if (choose == 4) {
			System.out.println("Please give two number");
			double x = scan.nextInt();
			double y = scan.nextInt();
			Operation divisors = new Divisors(x, y);
			divisors.printResult();
		}
	}

	private static void multiplication(int choose) {
		if (choose == 3) {
			System.out.println("Please give two number");
			double x = scan.nextInt();
			double y = scan.nextInt();
			Operation multiplication = new Multiplication(x, y);
			multiplication.printResult();
		}
	}

	private static void subtraction(int choose) {
		if (choose == 2) {
			System.out.println("Please give two number");
			double x = scan.nextInt();
			double y = scan.nextInt();
			Operation subtraction = new Subtraction(x, y);
			subtraction.printResult();
		}
	}

	private static void addition(int choose) {
		if (choose == 1) {
			System.out.println("Please give two number");
			double x = scan.nextInt();
			double y = scan.nextInt();
			Operation addition = new Addition(x, y);
			addition.printResult();
		}
	}

	private static void involve(int choose) {
		if (choose == 6) {
			System.out.println("Please give two number");
			double x = scan.nextInt();
			double y = scan.nextInt();
			Operation involve = new RaisingToPower(x, y);
			involve.printResult();
		}
	}

	private static void log10(int choose) {
		if (choose == 8) {
			System.out.println("Please give one number");
			double x = scan.nextInt();
			Operation log10 = new Logarithm10(x);
			log10.printResult();
		}
	}

	private static void log(int choose) {
		if (choose == 7) {
			System.out.println("Please give one number");
			double x = scan.nextInt();
			Operation log = new Logarithm(x);
			log.printResult();
		}
	}

	
	

	private static void instruction() {
		System.out.println("Please give one number because you want use the calculator");
		System.out.println("If you choose 1 this is addition/ If you choose 2 this is subtraction");
		System.out.println("If you choose 3 this is multiplication/ If you choose 4 this is divisors");
		System.out.println("If you choose 5 this is square/ If you choose 6 this is involving");
		System.out.println("If you choose 7 this is log/ If you choose 8 this is log10");
		
	}

	private static void error(int choose) throws Exception {
		if (choose > 8) {
			throw new Exception("You not good button print it sorry but for this stop the program");
		}
	}
}
