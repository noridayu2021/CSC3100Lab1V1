//NAME 		: BAVAMITHIRAN JEYAPRAGAS
//MATRIX	: 210468
//LAB		: 5
//QUESTION	: 2


import java.util.Scanner;

public class WeightAndHealthRisk {
	public static void main(String[]args) {
		Scanner input =new Scanner (System.in);
	
//input
		System.out.println("THIS IS SIUU HEALTH CHECK CORNER");

	
		System.out.println("ENTER YOUR GENDER ");
		System.out.println("ENTER 1 IF YOU ARE MALE ");
		System.out.println("ENTER 0 IF YOUR FEMALE ");
		int gender = input.nextInt();
		
		System.out.println("ENTER YOUR WEIGHT IN KG");
		double weight = input.nextDouble();
		
		System.out.println("ENTER YOUR HEIGHT IN METRES");
		double height = input.nextDouble();

		System.out.println("ENTER YOUR WAISTSIZE IN INCHES ");
		double waistsize = input.nextDouble();
		
//calculation
		
		double bmi = weight/(height*height);	
		System.out.println("YOUR BODY MASS INDEX IS  "+bmi);
		
			
//male
		if(gender==1 && waistsize<40) { 
			if(bmi>=18.5 && bmi<=24.9) {
				System.out.print("You have normal BMI and lower heart disease risk and type 2 diabetes");
			}
				else if(bmi>=25 && bmi<=29.9) {
					System.out.print("You are overweight and have lower heart disease risk and type 2 diabetes");
				}
				else if (bmi>=30 && bmi<=34.9) {
					System.out.print("You are obese and have lower heart disease risk and type 2 diabetes");
				}
				else if(bmi>=35) {
					System.out.print("You are severely obese and have lower heart disease and type 2 diabetes");
				}
		}
		if(gender==1 && waistsize>=40) {
			if(bmi>=18.5 && bmi<=24.9) {
				System.out.print("You have normal BMI and high heart disease risk and type 2 diabetes");
			}
				else if(bmi>=25 && bmi<=29.9) {
					System.out.print("You are overweight and have higher heart disease risk and type 2 diabetes");
				}
				else if (bmi>=30 && bmi<=34.9) {
					System.out.print("You are obese and have higher heart disease risk and type 2 diabetes");
				}
				else if(bmi>=35) {
					System.out.print("You are severely obese and have higher heart disease and type 2 diabetes");
				}
		}
//female
		if(gender==0 && waistsize<35) {
			if(bmi>=18.5 && bmi<=24.9) {
				System.out.print("You have normal BMI and lower heart disease risk and type 2 diabetes");
			}
				else if(bmi>=25 && bmi<=29.9) {
					System.out.print("You are overweight and have lower heart disease risk and type 2 diabetes");
				}
				else if (bmi>=30 && bmi<=34.9) {
					System.out.print("You are obese and have lower heart disease risk and type 2 diabetes");
				}
				else if(bmi>=35) {
					System.out.print("You are severely obese and have lower heart disease and type 2 diabetes");
				}
		}
		
		if(gender==0 && waistsize>=35) {
			if(bmi>=18.5 && bmi<=24.9) {
				System.out.print("You have normal BMI and high heart disease risk and type 2 diabetes");
			}
				else if(bmi>=25 && bmi<=29.9) {
					System.out.print("You are overweight and have higher heart disease risk and type 2 diabetes");
				}
				else if (bmi>=30 && bmi<=34.9) {
					System.out.print("You are obese and have higher heart disease risk and type 2 diabetes");
				}
				else if(bmi>=35) {
					System.out.print("You are severely obese and have higher heart disease and type 2 diabetes");
				}
		}
		}
				
			
					
					
					
					
				}
			
		
		
		
		
		
	


