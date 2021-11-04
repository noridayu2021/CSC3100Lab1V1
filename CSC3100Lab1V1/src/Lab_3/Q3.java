
import java.util.Scanner;
public class Q3 {
    public static void main(String[]args){
        // Declaration
        Scanner input = new Scanner(System.in);
        double subtotal;
        double gratuity;


        // Input
        System.out.println("Enter subtotal (RM) and gratuity rate (%)");
        subtotal = input.nextDouble();
        gratuity = input.nextDouble();

        // Calculation
        gratuity = subtotal * (gratuity/100);
        subtotal = gratuity + subtotal;
        System.out.println("Gratuity : RM " + gratuity);
        System.out.println("Total : RM "+subtotal);
        // Output
    }
}
