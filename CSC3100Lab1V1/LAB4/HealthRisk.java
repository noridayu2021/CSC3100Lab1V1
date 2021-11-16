//NAME 		: BAVAMITHIRAN JEYAPRAGAS
//MATRIX	: 210468
//LAB		: 4
//QUESTION	: Waist Size

import java.util.Scanner;
public class HealthRisk {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your waist size in inches");
		double waistsize=input.nextDouble();
		
		if(waistsize<35)
			System.out.println("You are in good health!!SIUU!!");
		
		else
			System.out.println("You have righ risk and need to visit the Doctor RIGHT NOW!!!");
		
		
	}

}
