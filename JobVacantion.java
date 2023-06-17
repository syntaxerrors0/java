import java.util.Scanner;

public class JobVacantion {
    public static void main(String[] args) {
        int umur, pengalaman;
        double penampilan;
        String lulus, nama, jeniskelamin;
        boolean reqKoor1,reqKoor2,reqAdmin1,reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di PT. Blablabla");
        System.out.println("===============================/n");
        System.out.println("Silahkan input Data Anda");
        System.out.println("Nama : ");
        nama = input.next();
        System.out.println("Umur : ");
        umur = input.nextInt();
        System.out.println("Jenis Kelamin : ");
        jeniskelamin = input.next();
        System.out.println("Lulusan : ");
        lulus = input.next();
        System.out.println("Pengalaman : ");
        pengalaman = input.nextInt();
        System.out.println("Penampilan : ");
        penampilan = input.nextDouble();

        reqKoor1 = jeniskelamin.equalsIgnoreCase("Pria") && umur >= 22 && umur <=30 && (lulus.equalsIgnoreCase("SMK") || lulus.equalsIgnoreCase("D3")) && pengalaman >=2;

        reqKoor2 = jeniskelamin.equalsIgnoreCase("Pria") && umur > 30 && (lulus.equalsIgnoreCase("S1")) && pengalaman >= 5;

        isPassingKoor = reqKoor1 || reqKoor2;

        reqAdmin1 = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <=25 && (lulus.equalsIgnoreCase("D3")) && penampilan >= 8.5 && pengalaman >=3;

        reqAdmin2 = jeniskelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulus.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3;

        isPassingAdmin = reqAdmin1 || reqAdmin2;

        System.out.println();
        System.out.println(nama + "Terimakasih Sudah Mengikuti lowongan kerja PT. Blablabla/n");
        System.out.println("Beerikut adalah hasil dari reqruitment Koordinator Dan Admin : ");
        System.out.println("Hasil Kelulusan untuk koordinator : " + isPassingKoor);
        System.out.println("Hasil Kelulusan untuk admin : " + isPassingAdmin);
    }
}