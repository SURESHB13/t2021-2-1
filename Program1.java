import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter two numbers");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("enter the type of operation");
		String operarationString = scanner.nextLine().trim().toLowerCase();
		try {
			if (operarationString.equalsIgnoreCase("addition")) {
				Double c = a + b;
				System.out.println("addition of two number is: " + c);

			} else if (operarationString.equalsIgnoreCase("substraction")) {
				Double c = a - b;
				System.out.println("substraction of two number is: " + c);

			} else if (operarationString.equalsIgnoreCase("multiplication")) {
				Double c = a * b;
				System.out.println("multiplication of two number is: " + c);

			} else if (operarationString.equalsIgnoreCase("division")) {
				Double c = a / b;
				System.out.println("division of two number is: " + c);

			} else {
				System.out.println(
						"enter the type of operation correctly ex addition,substraction,multiplication and division");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
