/*Lab : Lab 3
 Desc : Question 1
 */
import java.util.Scanner;
public class totalMarks {
	public static void main (String[] args) {
	
	Scanner lol = new Scanner (System.in);
	
	//prompt user to enter matric number
	System.out.print("Please enter your matric number : ");
	double matricNumber = lol.nextDouble();
	
	//prompt user to enter their following marks
	System.out.print("Enter mark for Assessment 1 : ");
	double assessment_1 = lol.nextDouble();
	
	System.out.print("Enter mark for Assessment 2 : ");
	double assessment_2 = lol.nextDouble();
	
	System.out.print("Enter mark for Lab Assignment : ");
	double lab_assignment = lol.nextDouble();
	
	System.out.print("Enter mark for Final Exam : ");
	double final_exam = lol.nextDouble();
	
	//calculate the numeric average
	double ass1 = assessment_1 * 0.15;
	double ass2 = assessment_2 * 0.20;
	double lab_ass = lab_assignment * 0.35;
	double finalExam = final_exam * 0.30;

	//calculate the total marks
	double totalMarks = ass1 + ass2 + lab_ass + finalExam;
	
	//Display results
	System.out.println("Your total mark for CSC3100 ( " + ass1 + " + " + ass2 + " + " + lab_ass + " + " + finalExam + " )" + " is " + totalMarks );
	
	}
}

