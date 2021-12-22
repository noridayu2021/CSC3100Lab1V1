import java.util.Scanner;
public class labextraQ2 {
public static void main(String[]args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter 10 booking information :");
	System.out.println("Rooms : Deluxe(D/d) Superior (S/s) Executive(E/e");
	int count=1;
	int total=0;
	int price=0;
	do {
		System.out.println("\n Booking " + count);
		count++;
		System.out.println("\nEnter your name : ");
		String name = input.nextLine();
		System.out.println("Enter your room code : ");
		char room = input.next().charAt(0);
		System.out.println("Enter the number of days : ");
		int days = input.nextInt();
		
		if (room=='d'||room=='D') {
			 price=(days*330);
			System.out.println(name + " Bill : RM  " + price );
			
		}
		else if (room=='s'||room=='S') {
			 price=(days*390);
			System.out.println(name + " Bill : RM  " + price );
		}
		else if(room=='e'||room=='E') {
			 price=(days*480);
			System.out.println(name + " Bill : RM  " + price );
		}
		else 
			System.out.println("Enter a valid room code !");
		total= price + total;
		
		input.nextLine();
		
	}
	while (count<3);
	
	System.out.println("the total is : RM " + total);
}
}
