import java.util.Scanner;
public class WaistSize {
	public static void main(String[]args) {
		
	//Declarations
		Scanner input = new Scanner(System.in);
		double waistSize;
		
	//Input
		System.out.println("Please enter your waist size (in inches) :");
		waistSize = input.nextDouble();
	
	if (waistSize<35)
		System.out.println("You are healthy");
	else
		System.out.println("You have high risk and needs to talk with your doctor SOON!!!");
}
}