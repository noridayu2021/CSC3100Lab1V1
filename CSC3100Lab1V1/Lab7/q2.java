import java.util.Scanner;
public class q2 {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	 int count=0;
	 System.out.println("enter integers");
	do {
		int num=input.nextInt();
		count++;
	}
	while(count<100);
	
}
}
