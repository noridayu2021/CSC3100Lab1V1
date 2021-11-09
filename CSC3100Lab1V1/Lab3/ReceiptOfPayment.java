
import java.util.Scanner;
public class ReceiptOfPayment {
public static void main(String[]args) {

Scanner input= new Scanner(System.in); 
System.out.print("This is CSC3100 Mart");

//Enter the item, quantity and the price 
System.out.print("Item1");
String item1 = input.nextLine();
System.out.print("Quantity of Item1");
int quantity1 = input.nextInt();
System.out.print("Price of Item 1");
double price1 =input.nextDouble();

System.out.print("Item2");
String item2= input.nextLine();
System.out.print("Quantity of Item2");
int quantity2 =input.nextInt();
System.out.print("Price of Item2");
double price2 =input.nextDouble();

input.close();

//constant
final double GOVTAX =0.06;
final double SERCHARGE = 0.10;

//calculate price of item without tac and service charge 
double priceitem1 =quantity1*price1;
double priceitem2 =quantity2*price2;

//calculate tax and service charge 
double totalprice =priceitem1+priceitem2;
double governmenttax = totalprice*GOVTAX;
double servicecharge =totalprice*SERCHARGE;
double total =totalprice +governmenttax +servicecharge ;


//print receipt 

System.out.println("Item1"  +item1);
System.out.println("Quantity1"  +quantity1);
System.out.println("Price1"  +price1);
System.out.println("Item 1 total price"  +priceitem1);

System.out.println("Item2"  +item2);
System.out.println("Quantity2"  +quantity2);
System.out.println("Price2"  +price2);
System.out.println("Item 2 total price"  +priceitem2);

System.out.println("subtotal of item 1 and item 2"  +totalprice);
System.out.println("Government Tax on subtotal"  +governmenttax);
System.out.println("service charge on subtotal"  +servicecharge);

System.out.println("PAY THIS AMOUNT IF YOU WANNA LEAVE THIS STORE"   +total);











}
}
