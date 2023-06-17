import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            int a,b;
            System.out.println("Hai, What's Your Name?");
            keyboard.nextLine();

            System.out.println("How much money did you spend at the Club on Saturday?");
            a = keyboard.nextInt();

            System.out.println("How much money did you spend at the Club on Sunday?");
            b = keyboard.nextInt();

            int Jumlah = a + b;
            double averange = Jumlah / 2;
            System.out.println("Your Total expenditure at the Club every Saturday and Sunday is $ " + Jumlah);
            System.out.println("With an averange daily expenditure of $ " + averange);
        }
    }