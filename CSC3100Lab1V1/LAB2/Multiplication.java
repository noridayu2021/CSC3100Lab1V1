//NAME 		: BAVAMITHIRAN JEYAPRAGAS
//MATRIX	: 210468
//LAB		: 2
//QUESTION	: Multiply the digits in an integer

public class Multiplication {
	public static void main(String[]args) {
		int integer = 123; //my chosen number
		int firstdigit = integer % 10; // extraction of digit 3 
		int seconddigit = (integer/10) % 10; // extraction of digit 2			
		int thirddigit = integer/100; // extraction of digit 1 
		int multiply = (firstdigit * seconddigit * thirddigit ); // multiplication of all the digits 
		System.out.println("Multiplication of digits is " +multiply);
		
		
		
		
	}

}
