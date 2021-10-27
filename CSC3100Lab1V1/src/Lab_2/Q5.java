// Name: Muniif Abdilah
// Matric no.: 209822
// Lab no.: 2
// Desc.: Convert pound weight to KG weight

public class Q5 {
    public static void main(String[] args) {
        int inputNum = 999;
        int firstDigit = inputNum % 10; //Extract -
        int secondDigit = (inputNum/10 ) %10;
        int thirdDigit = (inputNum / 100)%10;
        int multiple = firstDigit*secondDigit*thirdDigit;
        System.out.println(multiple);
    }
}
