import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word");
		String x=sc.next();
		System.out.println("Enter Second word");
		String y=sc.next();
		System.out.print(x);
		for(int dots=30-((x.length()+1)+(y.length()+1)); dots>=0; dots--){
			System.out.print(".");
		}
		System.out.println(y);

	}

}
