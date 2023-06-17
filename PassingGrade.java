import java.util.Scanner;
public class PassingGrade{
    public static void main(String[] args) {

        int a, b, c, d;
        double averangeUjian, averangeBahasa;
        boolean isPassingSMK, isPassingSastra, isPassingTIK;
        
        Scanner  keyboard = new Scanner(System.in);

        int PassingGradeSmk = 73;
        int PassingGradeSastra = 75;
        int PassingGradeTIK = 80;

        System.out.print("Masukan nilai ujian Matematika : ");
        a = keyboard.nextInt();
        System.out.print("Masukan nilai ujian Bhs.Indonesia : ");
        b = keyboard.nextInt();
        System.out.print("Masukan nilai ujian Bhs.Inggris : ");
        c = keyboard.nextInt();
        System.out.print("Masukan nilai ujian IPA : ");
        d = keyboard.nextInt();
        
        averangeUjian = (a + b + c +d)/ 4;
        averangeBahasa = (b + c)/2;

        isPassingSMK = averangeUjian >= PassingGradeSmk;
        isPassingSastra = averangeBahasa >= PassingGradeSastra;
        isPassingTIK = a >= PassingGradeTIK;

        System.out.println(" ");
        System.out.println("Hasil Dari simulasi untuk persyaratan penerimaan Calon Siswa Adalah sebagai Berikut :");
        System.out.println("Anda Memenuhi Syarat : " + isPassingSMK);
        System.out.println("Anda Memenuhi Syarat Masuk jurusan sastra : " + isPassingSastra);
        System.out.println("Anda Memenuhi Syarat Masuk jurusan Teknik komputer jaringan : " + isPassingTIK);
    }
}