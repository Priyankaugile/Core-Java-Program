import java.util.Scanner;
public class FlipCoin {

    public static void main(String[] args) {
        System.out.println("Enter how many times you want to flip coin :"); // 2
        Scanner sc = new Scanner(System.in);
        int flipCoin=sc.nextInt(); // flipcoin=2
        float tail=0,head=0; //tail 0.0 head 0.0
       // int flipCoin=2;

        for (int i=0; i<flipCoin; i++) { // flipcoin=2 i=0 ....TRUE
                                         // flipcoin=2 i=1 ....TRUE
            float randamNumber = (float) (Math.random()); //random=0.42
                                                          // random=  0.961
            if (randamNumber<0.5){
                tail++; // 1.0

            }
            else{
                head++; // 1.0
            }
        }
        System.out.println("Heads count : " +head); // head 1.0
        System.out.println("Tails count : " + tail); // tail 1.0
        float  perHead;
        perHead = (head/flipCoin)*100; //head 1.0 flip =2 perhead =50.0
        float perTail=100 - perHead; // 100-50.0 = 50.0
        System.out.println("Percentage of Heads and Tails : "+perHead+"% And "+perTail+"%" );
    }

}
