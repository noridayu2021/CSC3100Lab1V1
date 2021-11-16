import java.util.Scanner;
public class Ques1 {
	public static void main(String[]args) { //the main method
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter your matriks number :");
		double matriksNumber= input.nextDouble();
		System.out.print("Enter mark for Assessment 1 :");
		double markForAssessment1=input.nextDouble();
		System.out.print("Enter mark for Assessment 2 :");
		double markForAssessment2=input.nextDouble();
		System.out.print("Enter mark for Lab Assignment :");
		double markForLabAssignment=input.nextDouble();
		System.out.print("Enter your Final mark :");
		double finalMark=input.nextDouble();
		
		//CALCULATIONS
		double assessment1=(markForAssessment1/100)*15;
		double assessment2=(markForAssessment2/100)*20;
		double labAssignment=(markForLabAssignment/100)*35;
		double finals=(finalMark/100)*30;
		double totalMark=(assessment1+assessment2+labAssignment+finals);
		
		if(totalMark>50) 
			System.out.println("Your total mark for CSC3100 is " + totalMark +". CONGRATULATIONS YOU PASSED!!");
		else
			System.out.println("Your total mark for CSC3100 is " + totalMark +"FAIL.TRY HARDER:(");
		
		
		
		
	}


}
