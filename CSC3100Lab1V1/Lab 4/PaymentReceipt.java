import java.util.Scanner;
public class PaymentReceipt {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Galaxy Store");

		//Enter the item, quantity and the price
		System.out.print("Item you have choosen : ");
		String item1 = input.nextLine();

		System.out.print("Quantity of the item : ");
		int quantityItem1 = input.nextInt();

		System.out.print("Price of the item (RM) : ");
		double priceItem1 = input.nextDouble();

		input.nextLine();

		System.out.print("Item you have choosen : ");
		String item2 = input.nextLine();

		System.out.print("Quantity of the item : ");
		int quantityItem2 = input.nextInt();

		System.out.print("Price of the item (RM) : ");
		double priceItem2 = input.nextDouble();

		input.close();

		//declare constant
		final double GOVTAX = 0.06;
		final double SERVICECHARGE = 0.10 ;

		//calculate price of items
		double amountItem1 = quantityItem1*priceItem1 ;
		double amountItem2 = quantityItem2*priceItem2 ;

		//calculate total price,tax and discount
		double totalPrice = amountItem1+amountItem2 ;
		double govermentTax = totalPrice*GOVTAX ;
		double serviceCharge = totalPrice*SERVICECHARGE ;
		double grandTotal = totalPrice + govermentTax + serviceCharge ;
		double newTotal;
	
		
		if (totalPrice>50)
			newTotal = grandTotal-(grandTotal*0.2);
		else
			newTotal = grandTotal;
			
		
			System.out.println("#################################################");
			System.out.println(" 						 ");
			System.out.println(" 	Welcome to Galaxy Store			 ");
			System.out.println("                                                 ");
			System.out.println(" 	Item 1				: " + item1+"		 ");
			System.out.println(" 	Quantity			: RM" + quantityItem1+"		 ");
			System.out.println(" 	Price				: RM" + priceItem1+"		 ");
			System.out.println(" 	Amount				: RM" + amountItem1+"	 ");
			System.out.println(" ----------------------------------------------- ");
			System.out.println(" 	Item 2				: " + item2+"		 " );
			System.out.println(" 	Quantity			: RM" + quantityItem2+"		 " );
			System.out.println(" 	Price				: RM" + priceItem2+"		 " );
			System.out.println(" 	Amount				: RM" + amountItem2+"	 " );
			System.out.println(" 	---------------------------------------- " );
			System.out.println(" 	Subtotal			: RM" + totalPrice  );
			System.out.println(" 	Goverment Tax			: RM" + govermentTax+"          " );
			System.out.println(" 	Service Charge			: RM" + serviceCharge+"		 " );
			System.out.println(" 	Grandtotal			: RM" + grandTotal );
			System.out.println(" 	Total after Discount		: RM" + newTotal);
			System.out.println(" 						 ");
			System.out.println(" 	Thank You For Shopping			 " );
			System.out.println("#################################################");



		}
}
