import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
       double n , i;
        double sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want to compute as Harmonic Number :"); // 2
        n=sc.nextDouble();

        for( i=1;i<=n;i++)  // n=2
        {
            sum=sum+(1/i); //0.0+1/1.0=(1.0)---sum=1.0...(1)
                           //1.0+1/2.0=(1.5)---sum=1.5...(2) Ans
        }
        System.out.println("Harmonic value = "+sum);  // 1.5
    }
}
