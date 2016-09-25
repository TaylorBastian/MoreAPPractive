import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Weight?");
		int x=sc.nextInt();
		if(x>=220 && x<=280){
			System.out.println("You're allowed in the contest");
		}
		else{
			System.out.println("You're not allowed in the contest");
		}

	}

}
