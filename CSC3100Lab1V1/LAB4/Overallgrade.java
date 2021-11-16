//NAME 		: BAVAMITHIRAN JEYAPRAGAS
//MATRIX	: 210468
//LAB		: 4
//QUESTION	: Calculate overall grade for CSC3100


import java.util.Scanner;
public class Overallgrade {
     public static void main(String[]args) {
	
Scanner input = new Scanner(System.in);//creating new scanner object
System.out.println("CSC3100 Grade Calculator");

//Enter matrix number
System.out.println("Enter your Matrix Number");
int matrixnum = input.nextInt();

//Enter results obtained
System.out.println("Enter your mark in Assessment 1 in percentage");
double assessment1 = input.nextDouble();

System.out.println("Enter your mark in Assessment 2 in percentage");
double assessment2 = input.nextDouble();

System.out.println("Enter your mark in Lab Assignment in percentage");
double labassignment = input.nextDouble();

System.out.println("Enter your mark in Final Exam in percentage");
double finalexam = input.nextDouble();

//Calculation
double Assessment1 =(assessment1/100)*15;
double Assessment2 =(assessment2/100)*20;
double LabAssignment =(labassignment/100)*35;
double Finals =(finalexam/100)*30;
double TotalMark =(Assessment1+Assessment2+LabAssignment+Finals);

//Overall grade for CSC3100
System.out.println
("Your overall grade for CSC3100 is" + TotalMark);
//CONGRATULATIONS

/*System.out.println("YOUR TOTAL MARK");
TotalMark=input.nextDouble();*/

if (TotalMark<50.0)
	System.out.println("FAIL...SAD LIFE");

else
	System.out.println("PASS...CONGRATSSS");


}
}

