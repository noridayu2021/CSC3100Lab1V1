import java.util.Scanner;
public class Lab4_Problem1 {
	public static void main(String[]args) {
		
		//Create scanner object
		Scanner scan=new Scanner(System.in);
		//obtain input from user
		System.out.print("Enter integer number:");
		int number= scan.nextInt();
		
		//check if input positive or negative
		if(number>0)
			System.out.println("POSITIVE");
		else
			System.out.println("NEGATIVE");
	}
}
