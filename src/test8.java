import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		System.out.println("How many integers will be added:");
		for (int i = sc.nextInt(); i >0; i--) {
			System.out.println("Enter an integer: ");
			total=total+sc.nextInt();
		}
		System.out.println("The sum is " + total);

	}

}
