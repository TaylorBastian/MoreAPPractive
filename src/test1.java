import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount of purchases:");
		int x=sc.nextInt();
		if(x>=10){
			System.out.println(x-(x*0.1));
		}
		else{
			System.out.println(x);
		}
	}

}
