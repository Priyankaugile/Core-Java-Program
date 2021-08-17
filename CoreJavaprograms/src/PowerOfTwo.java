import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println("Enter power to 2 : ");
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int power;

        if (N>0 && N<31){
            power= (int) Math.pow(2, N);
            System.out.println("Table of 2 to power "+N+" : ");
            for (int i=1; i<=N;i++){
                System.out.println(2+" ^ "+i+" : "+(2*i));
            }
        }
    }
}
