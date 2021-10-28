//	Name		:Sahtish Rao Ramuloo
//	MatricNo	:210404
//	Lab		:2
//	Description	: To obtain sales price of an object after original price and discount percentage is provided
public class SalePrice {

	public static void main(String[] args) {
		
		int originalprice = 10 ;
		double discountpercentage = 50;
		double saleprice = originalprice-(originalprice*(discountpercentage/100));
		
		System.out.println("Sale price is RM "+saleprice);
	}

}
