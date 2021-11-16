import java.util.Scanner;
public class Lab4Ques3 {
public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	
	System.out.println("Please Enter 8 if male ");
	System.out.println("Please Enter 9 if female: ");
	int gender=input.nextInt();
	
	System.out.println("Please Enter Your Age: ");
	int age=input.nextInt();
	
	if((age>=18 && age<=30 && gender ==8))
		System.out.println("PASS");
	else
		System.out.println("REJECT");
	
	
	
		
	
 }
}
