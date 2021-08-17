import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter First number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextByte();

        System.out.println("Number before swap: ");
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);

        int team;
        team=a;
        a=b;
        b=team;

        System.out.println("Number after swap: ");
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
    }
}
