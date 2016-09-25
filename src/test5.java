import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Start Value?");
		int x=sc.nextInt();
		System.out.println("End Value?");
		int y=sc.nextInt();
		System.out.println();
		while(x<=y){
			System.out.println(x);
			x++;
		}
	}

}
