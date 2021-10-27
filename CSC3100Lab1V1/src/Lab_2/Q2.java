// Name: Muniif Abdilah
// Matric no.: 209822
// Lab no.: 2
// Desc.: To get the sales price, given original price and discount rate

public class Q2 {
    public static void main(String[]args){
        double oriPrice = 15.0;
        double percentDiscount = 6.0;
        double salesPrice = oriPrice * (1+ (percentDiscount/100));
        System.out.println( "Sales Price (RM): " + salesPrice);

    }
}
