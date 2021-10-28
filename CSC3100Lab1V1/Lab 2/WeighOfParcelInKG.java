//	Name		:Sahtish Rao Ramuloo
//	MatricNo	:210404
//	Lab		:2
//	Description	: To convert weight of parcel from pound to kilogram
public class WeighOfParcelInKG {
	
	public static void main(String[] args) {
		
	double weightinpound = 10;
	final double conversionvalue = 2.205; 					// Constant conversion value from pound to kilogram
	double weightinkilo = weightinpound/conversionvalue ; 	// Formula to convert pound to kilogram
	System.out.println("Weight of parcel in kilogram is "+weightinkilo);

}
}
