import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number equal to number of times a certain type of number series to be printed ");
		try {
			int numberOfTimes = scanner.nextInt();
			int j = 1;
			for (int i = 1; i <= numberOfTimes; i++) {
				if (i == 1) {
					System.out.print(j);
					j = j + 2;
				} else {
					System.out.print("," + j);
					j = j + 2;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
