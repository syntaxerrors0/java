import java.util.Scanner;
public class RainOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah hari ini hujan : ");
        String cuaca = input.next();

        if (cuaca.equals ("Tidak") ) {
            System.out.println("Saya Akan membeli makanan ke restoran");
        }
        else {
            System.out.println("Saya Akan membeli makanan menggunakan GOFOOD");
        }
    }
}