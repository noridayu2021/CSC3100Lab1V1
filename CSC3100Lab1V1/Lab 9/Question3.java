import java.util.Scanner;
public class Question3 {
	public static void main (String[]args) {
		
		Scanner input = new Scanner(System.in);
		char status;
		
		System.out.println("*************************");
		System.out.println("\nBMI Information");
		System.out.println("BMI (18.5-24.9) Normal");
		System.out.println("BMI (25-29.9) Over Weight");
		System.out.println("BMI (30-34.9) Obese");
		System.out.println("BMI (35-39.9) Severely Obese");
		System.out.println("BMI (>=40) Morbidly Obese\n");
		System.out.println("*************************");
		System.out.println("\nCAUTION!!!!!!");
		System.out.println("Women – waist size > 35 inches");
		System.out.println("Men – waist size > 40 inches  ");
		System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------\n");
		System.out.println("*************************\n");
		
		do {
		
		// input from user	
		System.out.println("\nHEALTH CALCULATOR\n");
		System.out.print("Enter your name : ");
		String name = input.nextLine();
		System.out.print("Enter your height in meter : ");
		double height = input.nextDouble();
		System.out.print("Enter your weight in kilograms : ");
		double weight = input.nextDouble();
		System.out.print("Enter your waist size in inches : ") ;
		double waist = input.nextDouble();
		System.out.print("Enter gender(1 if Male OR 0 if Female) : ");
		int gender = input.nextInt();
		double bmi = weight/(height*height); // formula to calculate bmi
		System.out.println( "\n" + name + " your BMI is " + String.format("%.2f",bmi) ); // print 2 decimal points only
		
		//conditions
		if ((gender==1 && waist<=40) || (gender==0 && waist<=35)){
			if ((bmi>=18.5 && bmi<=24.9))
				System.out.println("You have normal BMI and lower heart disease risk and type 2 diabetes \n");
			else if ((bmi>=25&& bmi<=29.9)) {
				System.out.println("You are overweight and have lower heart disease risk and type 2 diabetes\n");
			}
			else if ((bmi>=30&& bmi<=34.9)) {
				System.out.println("You are obese and have lower heart disease risk and type 2 diabetes\n");
			}
			else if (bmi>=35&& bmi <= 39.9) {
				System.out.println("You are severely obese and have lower heart disease risk and type 2 diabetes\n");
			}
			else if (bmi>=40) {
				System.out.println("You are morbidly obese and have lower heart disease risk and type 2 diabetes\n");
			}
			else if (bmi<18.5)
				System.out.println("You are underweight and lower heart disease risk and type 2 diabetes\n ");
			}
	
		else if ((gender==1 && waist>40)  || (gender==0 && waist>35)) {
			if ((bmi>=18.5 && bmi<=24.9))
				System.out.println("You have normal BMI and higher heart disease risk and type 2 diabetes\n ");
			else if ((bmi>=25&& bmi<=29.9)) {
				System.out.println("You are overweight and have higher heart disease risk and type 2 diabetes\n");
			}
			else if ((bmi>=30&& bmi<=34.9)) {
				System.out.println("You are obese and have higher heart disease risk and type 2 diabetes\n");
			}
			else if (bmi>=35 && bmi <= 39.9) {
				System.out.println("You are severely obese and have higher heart disease risk and type 2 diabetes\n");
			}
			else if (bmi>=40) {
				System.out.println("You are morbidly obese and have higher heart disease risk and type 2 diabetes\n");
			}
			else if (bmi<18.5)
				System.out.println("You are underweight and higher heart disease risk and type 2 diabetes\n ");
			}
	
			else
				System.out.println("Please enter a valid value\n");
		
		System.out.println("Continue with next person?.................." ); // input from user
		System.out.println("Enter Y if Yes " );
		System.out.println("Enter N if No " );
		status = input.next().charAt(0);
		input.nextLine();
		}
		
		while(status!='N');{
			System.out.println("Thank You for using the system and stay healthy........");
			
		}
		
		}

}