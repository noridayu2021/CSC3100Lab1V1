//Name:Daneshwaren Ragupathy
//Desc:Calculate sale price
//Matriks number:209858
public class SalePrice {
	public static void main(String[]args) {
		int originalprice=10;
		double discountpercentage=50;
		double saleprice=originalprice-(originalprice*(discountpercentage/100));//The formula to calculate sale price discount
		
		System.out.println("sale price is "+saleprice);
	}

}
