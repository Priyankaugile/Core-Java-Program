import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {

        System.out.println("Enter dividend number : ");
        Scanner sc = new Scanner(System.in);
        int Divident = sc.nextInt();

        System.out.println("Enter divisor number : ");
        int Divisor = sc.nextInt();

         float Quotient=0 ,Remainder=0;
         Quotient = (Divident / Divisor);
         Remainder = (Divident % Divisor);
        System.out.println("Quotient and Remainder: " +Quotient+"  , " +Remainder);



    }
}
