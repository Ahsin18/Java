import java.util.Scanner;

public class hello
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;

        System.out.println("Enter a word:");
        word = sc.next();

        System.out.println("You entered: " + word);
    }
}