
public class Price { //class

	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub
		double sale_price;                 //declaring variables and value
		double original_price=55.90;
		final double discount=0.35;
		
		sale_price=original_price-(original_price*discount);      //equation
		
		System.out.println("The sale price is "+sale_price ); //print sale price
	}

}
