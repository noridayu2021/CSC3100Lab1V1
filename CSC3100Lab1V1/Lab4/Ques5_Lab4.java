import java.util.Scanner;
public class Ques5_Lab4 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please Enter Waist Size in (INCHES):");
		double waistsize=input.nextDouble();
		
		if(waistsize<35)
			System.out.println("Congratulations You Are Healthy!!!!");
		else
			System.out.println("Please Visit the Doctor as soon as POSSIBLE!!TAKE CARE");
	}

}
