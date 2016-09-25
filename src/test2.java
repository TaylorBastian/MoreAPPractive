import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		final int boltPrice=5;
		final int nutPrice=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many bolts?");
		int bolts=sc.nextInt();
		System.out.println("How many nuts?");
		int nuts=sc.nextInt();
		System.out.println("How many washers?");
		int washers=sc.nextInt();
		System.out.print("Check the Order: ");
		if(bolts!=nuts){
			if(bolts>nuts){
				System.out.print("To many bolts or too few nuts ");
			}
			else{
				System.out.print("To many nuts or too few bolts");
			}
			
		}
		else{
			if(washers>=bolts*2){
				System.out.print("Order OK");
			}
			else{
				System.out.println("To few washers");
			}
		}
		System.out.println();
		System.out.println("Total cost: "+((bolts*boltPrice)+(nuts*nutPrice)+(washers)));

	}

}
