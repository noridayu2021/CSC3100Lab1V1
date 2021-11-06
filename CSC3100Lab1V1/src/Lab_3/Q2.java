// Name: Muniif bin Abdilah
// Matric No.: 209822
// Lab: Lab 3
// Question: 2
//
import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        // Declarations
        String item1Name;
        int item1Quantity;
        double item1Price;
        String item2Name;
        int item2Quantity;
        double item2Price;
        double subtotal;
        double total;
        double governmentTaxed;
        double serviceCharged;
        int points;
        final double GOVTAX = 0.06;
        final double SERVICECHARGE = 0.1;

        // Item 1 inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Item 1's Name: ");
        item1Name = input.nextLine();
        System.out.print("Item 1's Quantity: ");
        item1Quantity = input.nextInt();
        System.out.print("Item 1's Unit Price: RM");
        item1Price = input.nextDouble();
        input.nextLine();
        // Item 2 inputs
        System.out.print("Item 2's Name: ");
        item2Name = input.nextLine();
        System.out.print("Item 2's Quantity: ");
        item2Quantity = input.nextInt();
        System.out.print("Item 2's Unit Price: RM");
        item2Price = input.nextDouble();
        System.out.println("");
        input.close();
        // Calculations
        item1Price = item1Price * item1Quantity;
        item2Price = item2Price * item2Quantity;
        subtotal = item1Price + item2Price;
        governmentTaxed = subtotal * GOVTAX;
        serviceCharged = subtotal * SERVICECHARGE;
        total = governmentTaxed + serviceCharged + subtotal;
        points = (int)total ;
        
        // Outputs
        System.out.println("____________________________________________");
        System.out.println("              9Mart Receipt");
        System.out.println();

        System.out.println("Item 1: " + item1Name);
        System.out.println(item1Name + " Quantity: " + item1Quantity);
        System.out.println(item1Name + " Amount ("+ "RM"+ item1Price/item1Quantity + " x "+ item1Quantity+") : RM" + item1Price);

        System.out.println("-------------------------------------------");

        System.out.println("Item 2: " + item2Name);
        System.out.println(item2Name + " Quantity: " + item2Quantity);
        System.out.println(item2Name + " Amount ("+"RM"+ item2Price/item2Quantity + " x "+ item2Quantity+") : RM" + item2Price);

        System.out.println("____________________________________________");

        System.out.println("Subtotal: " + subtotal);
        System.out.printf("Govenment Tax: RM%.2f%n" , governmentTaxed);
        System.out.printf("Service Charge: RM%.2f%n" , serviceCharged);
        System.out.printf("Total: RM%.2f%n" , total);
        System.out.println("MartPoints with this purchase (Point/RM1): " + points + " points");
    }
}
