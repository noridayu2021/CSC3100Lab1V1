//	Name		:Sahtish Rao Ramuloo
//	MatricNo	:210404
//	Lab		:2
//	Description	:Multiply the digits in an integer
public class MultiplicationOfDigits {

	public static void main(String[] args) {
		
		int initialnum = 456 ; //The input integer
		int firstdigit = initialnum % 10 ; // Extraction of first digit 
		int seconddigit = (initialnum/10) % 10 ; // Extraction of second digit
		int thirddigit = (initialnum/100) ; // Extraction of third digit
		int multiply = (firstdigit * seconddigit * thirddigit); // Multiplication of all 3 digits
		System.out.println("Multiplication of the digits in " +initialnum +" is "+ multiply);

	}

}
