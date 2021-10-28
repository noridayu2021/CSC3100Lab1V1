//Name:Daneshwaren Ragupathy
//Matriks num: 209858
//Desc: To calculate the multiplication of digits
public class MultiplicationOfDigits {
public static void main (String[]args){
	int initialnum=789;
	int firstdigit=initialnum%10; // to obtain the first digit
    int seconddigit=(initialnum/10)%10;	//to obtain the second digit
    int thirddigit=(initialnum/100); //to obtain the third digit
    int multiplicationofdigit=(firstdigit * seconddigit * thirddigit); //the formula to calculate the multiplication of digits
    
    System.out.println("multiplication of digit "+ multiplicationofdigit);
	
}
}
