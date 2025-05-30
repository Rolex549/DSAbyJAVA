import java.util.Scanner;
public class functions{

    public static void factorial(int a) {
       int fact = 1;
       for (int i = a; i>=1; i--) {
           fact = fact * i;
       }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();

        factorial(a);


    }
}