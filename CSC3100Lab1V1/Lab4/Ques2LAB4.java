import java.util.Scanner;
public class Ques2LAB4 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		//inputs
		System.out.print("Item 1:");
		String item1=input.nextLine();
		
		System.out.print("Quantity:");
		int quantity1=input.nextInt();
	
		System.out.print("Unit Price:");
		double unitPrice=input.nextDouble();
		input.nextLine();
		
		System.out.print("Item 2:");
		String item2=input.nextLine();
		
		System.out.print("Quantity:");
		int quantity2=input.nextInt();
	
		System.out.print("Unit Price:");
		double unitPrice2=input.nextDouble();
		System.out.println("");
		input.close();
		
		//output
		System.out.println("Item 1: " + item1);
		System.out.println("Quantity: "+ quantity1);
		System.out.println("Unit Price: " + unitPrice);
		double item1Price=(unitPrice*quantity1);
		System.out.println("Amount: RM" + item1Price);
		System.out.println("************************");
		System.out.println("Item 2: " + item2);
		System.out.println("Quantity: " + quantity2);
		System.out.println("Unit Price: "+ unitPrice2);
		double item2Price=(unitPrice2*quantity2);
		System.out.println("Amount: RM" + item2Price);
		System.out.println("");
		
		final double tax=0.06;                //constants
		final double servicecharge=0.1;       //constants
		double subtotal=(item1Price+item2Price);
		System.out.println("Subtotal: RM" + subtotal );
		double governmenttax=(subtotal*tax);
		System.out.println("Government Tax: RM" + governmenttax);
		double serviceCharge=(subtotal*servicecharge);
		System.out.println("Service Charge: RM" + serviceCharge);
		System.out.println("");
		double total=(subtotal+governmenttax+serviceCharge);
		System.out.println("Total: RM" + total);
		
		if(total>50) {
			System.out.println("Discount provided is 20%");
		   	double newtotal=(total*0.8);
		   	System.out.println("New total is : RM" +newtotal);
		}else {
		   	System.out.println("NOT APPLICABLE FOR DISCOUNT");
		}		
		
		
		
	
	}


}
