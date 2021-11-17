//	Name		:Sahtish Rao Ramuloo
//	MatricNo	:210404
//	Lab		:5
//	Question	:2
//	Description	:To calculate BMI and to show health risk
import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		
		//Declarations
		Scanner input = new Scanner(System.in);
		double height ;
		double weight ;
		double waistSize ;
		int gender ; // male is 1 and female is 0
		double BMI ;
		
		//Input
		System.out.println("Welcome to your Personal Health Check");
		System.out.println("To start please enter...");
		System.out.println("Weight(kg) :");
		weight = input.nextDouble();
		System.out.println("Height(m) :");
		height = input.nextDouble();
		System.out.println("Waist size(inch) :");
		waistSize = input.nextDouble();
		System.out.println("Gender(1 if Male OR 0 if Female) :");
		gender = input.nextInt();
		
		//Calculations
		
		BMI = weight/(height*height);
		
		//Gender male
		if ((gender==1 && waistSize<=40)){
				if ((BMI>=18.5 && BMI<=24.9))
					System.out.print("You have normal BMI and lower heart disease risk and type 2 diabetes ");
				else if ((BMI>=25&& BMI<=29.9)) {
					System.out.print("You are overweight and have lower heart disease risk and type 2 diabetes");
				}
				else if ((BMI>=30&& BMI<=34.9)) {
					System.out.print("You are obese and have lower heart disease risk and type 2 diabetes");
				}
				else if (BMI>35) {
					System.out.print("You are severely obese and have lower heart disease risk and type 2 diabetes");
				}
				else if (BMI<18.5)
					System.out.print("You are underweight and lower heart disease risk and type 2 diabetes ");
		}
		
		else if ((gender==1 && waistSize>40)) {
			if ((BMI>=18.5 && BMI<=24.9))
				System.out.print("You have normal BMI and higher heart disease risk and type 2 diabetes ");
			else if ((BMI>=25&& BMI<=29.9)) {
				System.out.print("You are overweight and have higher heart disease risk and type 2 diabetes");
			}
			else if ((BMI>=30&& BMI<=34.9)) {
				System.out.print("You are obese and have higher heart disease risk and type 2 diabetes");
			}
			else if (BMI>35) {
				System.out.print("You are severely obese and have higher heart disease risk and type 2 diabetes");
			}
			else if (BMI<18.5)
				System.out.print("You are underweight and higher heart disease risk and type 2 diabetes ");
		}
		
		//Gender female
		else if ((gender==0 && waistSize<=35)){
			if ((BMI>=18.5 && BMI<=24.9))
				System.out.print("You have normal BMI and lower heart disease risk and type 2 diabetes ");
			else if ((BMI>=25&& BMI<=29.9)) {
				System.out.print("You are overweight and have lower heart disease risk and type 2 diabetes");
			}
			else if ((BMI>=30&& BMI<=34.9)) {
				System.out.print("You are obese and have lower heart disease risk and type 2 diabetes");
			}
			else if (BMI>35) {
				System.out.print("You are severely obese and have lower heart disease risk and type 2 diabetes");
			}
			else if (BMI<18.5)
				System.out.print("You are underweight and lower heart disease risk and type 2 diabetes ");
		}
		
		else if ((gender==0 && waistSize>35)) {
			if ((BMI>=18.5 && BMI<=24.9))
				System.out.print("You have normal BMI and higher heart disease risk and type 2 diabetes ");
			else if ((BMI>=25&& BMI<=29.9)) {
				System.out.print("You are overweight and have higher heart disease risk and type 2 diabetes");
			}
			else if ((BMI>=30&& BMI<=34.9)) {
				System.out.print("You are obese and have higher heart disease risk and type 2 diabetes");
			}
			else if (BMI>35) {
				System.out.print("You are severely obese and have higher heart disease risk and type 2 diabetes");
			}
			else if (BMI<18.5)
				System.out.print("You are underweight and higher heart disease risk and type 2 diabetes ");
		}
		
		else
			System.out.println("Please enter a valid value");
		
	
}
}
