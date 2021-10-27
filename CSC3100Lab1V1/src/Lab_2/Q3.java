// Name: Muniif Abdilah
// Matric no.: 209822
// Lab no.: 2
// Desc.: Convert pound weight to KG weight

public class Q3 {
    public static void main(String[]args){
        final double convFact = 0.453592; // Define const conversion factor
        double poundWeight = 100;
        double kgWeight = poundWeight * convFact; // Calculate the conversion
        System.out.printf("Pound to Kg: %.3f",kgWeight);
    }
}
