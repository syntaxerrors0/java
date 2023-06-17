import java.util.Random;
import java.util.Scanner;
 public class GuessNumber{
 public static void main(String[]args) {
    Random number = new Random();
    Scanner Guess = new Scanner(System.in);
        System.out.print(Guess.nextInt());

        for (int i = 0; i <= 10; i++) {
            System.out.println();
        }
    }
 }