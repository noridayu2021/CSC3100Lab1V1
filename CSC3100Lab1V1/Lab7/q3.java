import java.util.Scanner;
public class q3 {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter integers :");
	int num=0;
	int count=0;
	int smalNum=0;
	do {
		num=input.nextInt();
		count++;
		if(count==1) {
			smalNum=num;
		}
		else if(num<smalNum) {
			smalNum=num;
		}
		else
			smalNum=smalNum;
	}
	while(count<3);
	System.out.println("smallest integer is " + smalNum);
}
}
