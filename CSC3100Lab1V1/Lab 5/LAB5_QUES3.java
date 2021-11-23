import java.util.Scanner;
public class LAB5_QUES3 {
	public static void main(String[]args){
		  
		  Scanner sc = new Scanner(System.in);
		  
		  //declare valid variable
		  int credit_hours;
		  String semesterNo;
		  double tuitionFees=0;
		  String codeProgram;
		  String MEOH, MCS, MPM, ME, meoh, mcs, mpm, me;
		  final double MCS_credit_fee=250;
		  final double ME_credit_fee=250;
		  final double MPM_credit_fee=275;
		  final double MEOH_credit_fee=350;


		  
		  //prompt user
		  System.out.print("\nCode Program: ");
		  //read code program
		  codeProgram=sc.nextLine();
		  
		  //prompt user
		  System.out.print("Semester No: ");
		  //read semester no
		  semesterNo=sc.nextLine();
		  
		  //prompt user
		  System.out.print("Credit Hours Registered: ");
		  //read credit hours registered
		  credit_hours=sc.nextInt();
		  
		  //conditions, print output and footer 
		  if (codeProgram.equals("MCS")||codeProgram.equals("mcs")) {
		   
		      if (semesterNo.equals("1")) {
		         tuitionFees=(credit_hours*MCS_credit_fee)+1250;
		         System.out.print("\n\n********************************************");
		         System.out.print("\nMaster Programme: Master of Computer Science");
		         System.out.print("\n********************************************");
		         System.out.print("\n\nSemester No: "+semesterNo);
		         System.out.print("\nCredit Hours: "+ credit_hours);
		         System.out.print("\nTotal tuition fees= RM"+tuitionFees); 
		         System.out.print("\n\n>>>Please settle paying the total tuition fees a week in advance<<<");
		         System.out.print("\n>>>Thanks for your cooperation !<<<"); }

		      else {
		         tuitionFees=(credit_hours*MCS_credit_fee)+1000;
		         System.out.print("\n\n********************************************");
		         System.out.print("\nMaster Programme: Master of Computer Science");
		         System.out.print("\n********************************************");
		         System.out.print("\n\nSemester No: "+semesterNo);
		         System.out.print("\nCredit Hours: "+ credit_hours);
		         System.out.print("\nTotal tuition fees= RM"+tuitionFees); 
		         System.out.print("\n\n>>>Please settle paying the total tuition fees a week in advance<<<");
		         System.out.print("\n>>>Thanks for your cooperation !<<<"); }
		   }
		   else if (codeProgram.equals("ME")||codeProgram.equals("me")){
		     
		      if (semesterNo.equals("1")) {
		         tuitionFees = (credit_hours*ME_credit_fee)+1400;
		         System.out.print("\n\n***************************************");
		         System.out.print("\nMaster Programme: Master of Environment");
		         System.out.print("\n***************************************");
		         System.out.print("\n\nSemester No: "+semesterNo);
		         System.out.print("\nCredit Hours: "+ credit_hours);
		         System.out.print("\nTotal tuition fees= RM"+tuitionFees); 
		         System.out.print("\n\n>>>Please settle paying the total tuition fees a week in advance<<<");
		         System.out.print("\n>>>Thanks for your cooperation !<<<"); }

		      else {
		         tuitionFees = (credit_hours*ME_credit_fee)+1100;
		         System.out.print("\n\n***************************************");
		         System.out.print("\nMaster Programme: Master of Environment");
		         System.out.print("\n***************************************");
		         System.out.print("\n\nSemester No: "+semesterNo);
		         System.out.print("\nCredit Hours: "+ credit_hours);
		         System.out.print("\nTotal tuition fees= RM"+tuitionFees); 
		         System.out.print("\n\n>>>Please settle paying the total tuition fees a week in advance<<<");
		         System.out.print("\n>>>Thanks for your cooperation !<<<"); }

		   }
		   else if (codeProgram.equals("MPM")||codeProgram.equals("mpm")){
		      
		      if (semesterNo.equals("1")) {
		         tuitionFees = (credit_hours*MPM_credit_fee)+1250;
		         System.out.print("\n\n************************************************");
		         System.out.print("\nMaster Programme: Master in Platation Management");
		         System.out.print("\n************************************************");
		         System.out.print("\n\nSemester No: "+semesterNo);
		         System.out.print("\nCredit Hours: "+ credit_hours);
		         System.out.print("\nTotal tuition fees= RM"+tuitionFees); 
		         System.out.print("\n\n>>>Please settle paying the total tuition fees a week in advance<<<");
		         System.out.print("\n>>>Thanks for your cooperation !<<<"); }

		      else {
		         tuitionFees = (credit_hours*MPM_credit_fee)+1000;
		         System.out.print("\n\n************************************************");
		         System.out.print("\nMaster Programme: Master in Platation Management");
		         System.out.print("\n************************************************");
		         System.out.print("\n\nSemester No: "+semesterNo);
		         System.out.print("\nCredit Hours: "+ credit_hours);
		         System.out.print("\nTotal tuition fees= RM"+tuitionFees); 
		         System.out.print("\n\n>>>Please settle paying the total tuition fees a week in advance<<<");
		         System.out.print("\n>>>Thanks for your cooperation !<<<"); }

		   }
		   else if (codeProgram.equals("MEOH")||codeProgram.equals("meoh")){
		      
		      if (semesterNo.equals("1")) {
		         tuitionFees = (credit_hours*MEOH_credit_fee)+1250;
		         System.out.print("\n\n***************************************************************");
		         System.out.print("\n\nMaster Programme: Master of Environment and Occupational Health");
		         System.out.print("\n\n***************************************************************");
		         System.out.print("\n\nSemester No: "+semesterNo);
		         System.out.print("\nCredit Hours: "+ credit_hours);
		         System.out.print("\nTotal tuition fees= RM"+tuitionFees); 
		         System.out.print("\n\n>>>Please settle paying the total tuition fees a week in advance<<<");
		         System.out.print("\n>>>Thanks for your cooperation !<<<"); }

		      else {
		         tuitionFees = (credit_hours*MEOH_credit_fee)+1000;
		         System.out.print("\n\n***************************************************************");
		         System.out.print("\n\nMaster Programme: Master of Environment and Occupational Health");
		         System.out.print("\n\n***************************************************************");
		         System.out.print("\n\nSemester No: "+semesterNo);
		         System.out.print("\nCredit Hours: "+ credit_hours);
		         System.out.print("\nTotal tuition fees= RM"+tuitionFees);
		         System.out.print("\n\n>>>Please settle paying the total tuition fees a week in advance<<<");
		         System.out.print("\n>>>Thanks for your cooperation !<<<"); }

		   }
		   else
		         System.out.print("Data invalid, Please enter the correct input!");
		   
		   
		   }
}
