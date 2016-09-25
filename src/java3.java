import java.util.Scanner;

public class java3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Capacity of Tank?");
		float cap=sc.nextFloat();
		System.out.println("Gauge reading:");
		float red=sc.nextFloat();
		System.out.println("Miles per gallon:");
		float mpg=sc.nextFloat();
		if((cap*(red/100))*mpg<=200){
			System.out.println("Get gas!!!!!!!!!!!!!!!!!");
		}
		else{
			System.out.println("Good to go");
		}

	}

}
