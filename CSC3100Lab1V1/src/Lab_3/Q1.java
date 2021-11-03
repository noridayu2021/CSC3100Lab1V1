import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        // Declarations
        Scanner input = new Scanner(System.in);
        String matricNo;
        double assess1;
        double assess2;
        double labAssign;
        double finalExam;
        double sumCoursePercent;
        final int ASSESS1_PERCENT = 15;
        final int ASSESS2_PERCENT = 20;
        final int LABASSIGN_PERCENT = 35;
        final int FINALEXAM_PERCENT = 30;
        //Identification
        System.out.println("CSC3100 - Total Mark Calculator");
        System.out.println("Enter your matric no.: ");
        matricNo = input.nextLine();

        // Retrieve components percent
        System.out.println("Hello, " + matricNo + "\n");
        System.out.print("Enter your percentage for assessment 1 (in percent): "); // TODO: Exception on out of range
        assess1 = input.nextDouble();
        System.out.print("Enter your percentage for assessment 2 (in percent): ");
        assess2 = input.nextDouble();
        System.out.print("Enter your percentage for Lab Assignment (in percent): ");
        labAssign = input.nextDouble();
        System.out.print("Enter your percentage for Final Exam (in percent): ");
        finalExam = input.nextDouble();
        input.close(); // Linter recommends
        System.out.print("\n");


        // Calculation - Conversion to marks from percentage
        assess1 = ( assess1 / 100 ) * ASSESS1_PERCENT;
        assess2 = ( assess2 / 100 ) * ASSESS2_PERCENT;
        labAssign = ( labAssign / 100 ) * LABASSIGN_PERCENT;
        finalExam = ( finalExam / 100 ) * FINALEXAM_PERCENT;

        // Add up all weighted marks and assign to sum variable and print
        sumCoursePercent = assess1 + assess2 + labAssign + finalExam;
        System.out.printf("Total marks ( %.2f + %.2f + %.2f + %.2f ) for %s : %.2f", assess1, assess2, labAssign, finalExam, matricNo,sumCoursePercent);

    }
}
