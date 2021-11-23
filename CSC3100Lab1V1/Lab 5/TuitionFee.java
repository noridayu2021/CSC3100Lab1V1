//	Name		:Sahtish Rao Ramuloo
//	MatricNo	:210404
//	Lab		:5
//	Question	:3
//	Description	:Calculate the tuition fees 
import java.util.Scanner;
public class TuitionFee {
	public static void main(String[] args) {
		
		//Declare Variables
		Scanner input = new Scanner(System.in);
		int creditHour;
		String semesterNo;
	    String programCode;
		String  MCS,ME,MPM,MEOH,mcs,me,mpm,meoh;
		final double MCS_credit_fee=250;
		final double ME_credit_fee=250;
		final double MPM_credit_fee=275;
		final double MEOH_credit_fee=350;
		double tuitionFees=0;
		
		//Input
		System.out.print("Please enter your Program code: ");
		programCode=input.nextLine();
		System.out.print("Please Semester No: ");
		semesterNo=input.nextLine();
		System.out.print("Credit Hours Registered: ");
		creditHour=input.nextInt();
		
		 //Conditions
		  if (programCode.equals("MCS")||programCode.equals("mcs")) {
		   
		      if (semesterNo.equals("1")) {
		         tuitionFees=(creditHour*MCS_credit_fee)+1250;
		         System.out.println("Master Programme: Master of Computer Science");
		         System.out.println("Semester No: "+semesterNo);
		         System.out.println("Credit Hours: "+ creditHour);
		         System.out.println("Total tuition fees= RM"+tuitionFees);} 
		        
		     else {
		         tuitionFees=(creditHour*MCS_credit_fee)+1000;
		         System.out.println("Master Programme: Master of Computer Science");
		         System.out.println("Semester No: "+semesterNo);
		         System.out.println("Credit Hours: "+ creditHour);
		         System.out.println("Total tuition fees= RM"+tuitionFees); 
		         }
		   }
		   else if (programCode.equals("ME")||programCode.equals("me")){
		     
		      if (semesterNo.equals("1")) {
		         tuitionFees = (creditHour*ME_credit_fee)+1400;
		         System.out.println("Master Programme: Master of Environment");
		         System.out.println("Semester No: "+semesterNo);
		         System.out.println("Credit Hours: "+ creditHour);
		         System.out.println("Total tuition fees= RM"+tuitionFees); 
		      }
		         
		      else {
		         tuitionFees = (creditHour*ME_credit_fee)+1100;
		         System.out.println("Master Programme: Master of Environment");
		         System.out.println("Semester No: "+semesterNo);
		         System.out.println("Credit Hours: "+ creditHour);
		         System.out.println("Total tuition fees= RM"+tuitionFees); 
		      }
		   }
		   else if (programCode.equals("MPM")||programCode.equals("mpm")){
		      
		      if (semesterNo.equals("1")) {
		         tuitionFees = (creditHour*MPM_credit_fee)+1250;
		         System.out.println("Master Programme: Master in Platation Management");
		         System.out.println("Semester No: "+semesterNo);
		         System.out.println("Credit Hours: "+ creditHour);
		         System.out.println("Total tuition fees= RM"+tuitionFees); 
		      }
		         

		      else {
		         tuitionFees = (creditHour*MPM_credit_fee)+1000;
		         System.out.println("Master Programme: Master in Platation Management");
		         System.out.println("Semester No: "+semesterNo);
		         System.out.println("Credit Hours: "+ creditHour);
		         System.out.println("Total tuition fees= RM"+tuitionFees); 
		      }
		   }
		   else if (programCode.equals("MEOH")||programCode.equals("meoh")){
		      
		      if (semesterNo.equals("1")) {
		         tuitionFees = (creditHour*MEOH_credit_fee)+1250;
		         System.out.println("Master Programme: Master of Environment and Occupational Health");
		         System.out.println("Semester No: "+semesterNo);
		         System.out.println("Credit Hours: "+ creditHour);
		         System.out.println("Total tuition fees= RM"+tuitionFees); 
		      }

		      else {
		         tuitionFees = (creditHour*MEOH_credit_fee)+1000;
		         System.out.println("Master Programme: Master of Environment and Occupational Health");
		         System.out.println("Semester No: "+semesterNo);
		         System.out.println("Credit Hours: "+ creditHour);
		         System.out.println("Total tuition fees= RM"+tuitionFees); 
		      }

		   }
		   else
		         System.out.println("Please enter valid values");
		   
		   
		   
}

}