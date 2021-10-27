
public class BMI { //class

	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub
		double weight=74;     //declare variable and value
		double height=1.74;
		double bmi;
		
		bmi=weight/Math.pow(height, 2);
		System.out.println("BMI is "+bmi); //print bmi
	}

}
