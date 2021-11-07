//	Name		:Sahtish Rao Ramuloo
//	MatricNo	:210404
//	Lab		:3
//	Question	:1
//	Description	:To obtain overall grade for CSC3100
import java.util.Scanner;
public class OverallGradeCSC3100 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Welcome to UPM CSC3100 Grade Calculator");

//Enter matric number
System.out.println("Please Enter Your Matric Number:");						
int matricNum= input.nextInt();

//Enter mark obtained
System.out.println("Please Enter Your Mark for Assessment 1 (100%):");		
double assessment1= input.nextDouble();

System.out.println("Please Enter Your Mark for Assessment 2 (100%):");		
double assessment2= input.nextDouble();

System.out.println("Please Enter Your Mark for Lab Assignment (100%):");	
double labAssignment= input.nextDouble();

System.out.println("Please Enter Your Mark for Final Exam (100%):");		
double finalExam= input.nextDouble();

//declare constant percentage allocated for each test
final double MARKASSESSMENT1 = 0.15;					
final double MARKASSESSMENT2 = 0.20;					
final double MARKLABASSIGNMENT = 0.35;					
final double MARKFINALEXAM = 0.30;						

//Calculate overall grade for CSC3100
double OverallGrade = (assessment1*MARKASSESSMENT1)+(assessment2*MARKASSESSMENT2)+(labAssignment*MARKLABASSIGNMENT)+(finalExam*MARKFINALEXAM); 

//Print the overall result for CSC3100
System.out.println("Breakdown of your marks are= " + assessment1*MARKASSESSMENT1 + " + " + assessment2*MARKASSESSMENT2 + " + " +labAssignment*MARKLABASSIGNMENT + " + " + finalExam*MARKFINALEXAM);
System.out.println(matricNum + " your overall grade for CSC3100 is "+OverallGrade +" CONGRATS");





		
	}

}
