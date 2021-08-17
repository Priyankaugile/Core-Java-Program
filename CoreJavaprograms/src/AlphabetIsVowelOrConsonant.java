import java.util.Scanner;

public class AlphabetIsVowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("enter any Alphabet: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(" Alphabet is vowel.");
        }
        else {
            System.out.println("Alphabet is Consonant.");
        }
    }
}
