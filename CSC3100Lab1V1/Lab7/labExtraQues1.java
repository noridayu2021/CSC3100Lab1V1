import java.util.Scanner;
public class labExtraQues1 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Enter first number : ");
		num1=input.nextInt();
		System.out.println("Enter second number : ");
		num2=input.nextInt();
		
		do {
			if(num1<num2) {
				System.out.print(num1);
				num1++;
			}
			else if(num1>num2) {
				System.out.print(num1);
				num1--;
			}
		}
		while (num1!=num2);{
			if(num1==num2) {
				System.out.print(num1);
			}
			
			
		}
		
		
		
	}
		
}
