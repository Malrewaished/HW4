import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter the variable number :");
        int num = sc.nextInt();

        try {
            getNumber(num);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void getNumber(int x) throws ArithmeticException{

            if (x % 5 == 0) {
                System.out.println("Divided by 5 ");
            }
        else
            throw new ArithmeticException("Not divided by 5 ");
    }
}