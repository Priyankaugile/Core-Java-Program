import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter three number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && a>3 ){
            System.out.println("largest number: " +a );
        }

        else if (b>a && b>c){
            System.out.println("largest number: " +b);
        }
        else {
            System.out.println("largest number: " +c);
        }


    }
}
