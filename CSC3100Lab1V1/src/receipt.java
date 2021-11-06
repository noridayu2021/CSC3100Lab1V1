/*Lab : Lab 3
 Desc : Question 2
 Name : Ainsyah*/
import java.util.Scanner;
public class receipt {
	public static void main (String[] args){
		
		Scanner lel = new Scanner (System.in);//object for item 1
		 
		System.out.print("Item 1 : ");
		String item1 = lel.nextLine();
		System.out.print("Quantity : ");
		int quantity_1 = lel.nextInt();
		System.out.print("Unit Price : RM ");
		double price1 = lel.nextDouble();
		
		Scanner lol = new Scanner (System.in);//object for item 2
		
		System.out.print("Item 2 : ");
		String item2 = lol.nextLine();
		System.out.print("Quantity : ");
		int quantity_2 = lol.nextInt();
		System.out.print("Unit Price : RM ");
		double price2 = lol.nextDouble();
		
		//display item 1
		System.out.println("");
		System.out.println("Item 1 : " + item1);
		System.out.println("Quantity : " + quantity_1);
		System.out.println("Unit Price : RM " + price1);
		double amount1 = price1 * quantity_1;
		System.out.println("Amount : RM " + amount1);
		
		System.out.println("*****************************");
		
		//display item 2
		System.out.println("Item 2 : " + item2);
        System.out.println("Quantity : " + quantity_2);
		System.out.println("Unit Price : RM " + price2);
		double amount2 = price2 * quantity_2;
		System.out.println("Amount : RM "+ amount2);
		
		//calculate all
		double subtotal = (amount1 + amount2);
		double rounded = Math.round(subtotal * 100.0)/100.0;
		
		double governmentTax = (subtotal * 0.06 * 100)/100;
		double rounded1 = Math.round(governmentTax * 100.0)/100.0;
		
		double serviceCharge = subtotal * 0.10;
		double rounded2 = Math.round(serviceCharge* 100.0)/100.0;
		
		double total = subtotal + governmentTax + serviceCharge;
		double rounded3 = Math.round(total * 100.0)/100.0;
		
		//display total
		System.out.println ("");
		System.out.println("Subtotal : RM " + rounded);
		System.out.println("Government Tax : RM " + rounded1);
		System.out.println("Service Charge : RM " + rounded2);
		System.out.println("Total : RM " + rounded3);
	}

}
