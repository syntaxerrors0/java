import java.util.Scanner;

public class CafeReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Day, Monday, Tuesday, Weednesday, Thursday, Friday, Saturday, Sunday;
        String Male, Female;
        String Young, Ladies, Woman, Oldes, Party, Weekend;
        String name, gender, result;
        int age, attractive, money;

        result = "";

        System.out.println("Welcome To Reservation Cafe");
        System.out.println(" ");
        System.out.println("Please input Your Name : ");
        name = input.next();
        System.out.println("How Old are you : ");
        age = input.nextInt();
        System.out.println("What's your gender : ");
        gender = input.next();
        System.out.println("How attractive are you : ");
        attractive = input.nextInt();
        System.out.println("How much money you have : ");
        money = input.nextInt();
        System.out.println("What day do you want to make a reversation : ");
        Day = input.next();

        if(Day.equalsIgnoreCase("Monday")) {
            if(age >= 20 && age <=30 && money >= 500) {
            result = "reservation succesfully, You can order on monday, young night.";
        }else{
            result = "Sorry. you can't order on monday, cause it's for young";
        }
        }
        else if(Day.equalsIgnoreCase("Tuesday")) {
            if(age > 30 && age <=50 && money >= 250) {
            result = "reservation succesfully, You can order on Tuesday, old man.";
        }else{
            result = "Sorry. you can't order on Tuesday, cause it's for old man";
        }
        }else if(Day.equalsIgnoreCase("Weednesday")) {
            if(gender.equalsIgnoreCase("Female") && age >=20 && age <=35 && attractive >= 8 && money >= 300) {
           result = "reservation succesfully, You can order on Weednesday, Ladies.";
        }else{
            result = "Sorry. you can't order on Weednesday, cause it's for Ladies";
        }
        }else if(Day.equalsIgnoreCase("Thursday")) {
            if(gender.equalsIgnoreCase("Female") && age >= 20 && age <=30 && money >= 300) {
           result = "reservation succesfully, You can order on Thursday, Party night for single.";
        }else if(gender.equalsIgnoreCase("Male") && age >= 20 && age <=30 && money >= 2000) {
           result = "reservation succesfully, You can order on Thursday, Party night for single.";
        }else{
            result = "Sorry. you can't order on Weednesday, cause it's for Party night for single";
        }
        }else if(Day.equalsIgnoreCase("Friday")) {
            if(gender.equalsIgnoreCase("Female") && age >= 32 && age <= 45 && money >= 2000) {
           result = "reservation succesfully, You can order on Friday, Woman Night.";
        }else if(gender.equalsIgnoreCase("Male") && age >= 20 && age <=25 && attractive >= 8) {
           result = "reservation succesfully, You can order on Friday, Men night.";
        }else{
            result = "Sorry. you can't order on Friday, cause it's for Women night";
        }
        }else if(Day.equalsIgnoreCase("Saturday") || Day.equalsIgnoreCase("Sunday")) {
            if(age >= 20 && age <= 60 && money >= 200) {
           result = "reservation succesfully, You can order on Weekend, For All.";
        }else{
            result = "Sorry. you can't order on Weekend, cause it's for all";
        }
        }

        System.out.println();
        System.out.println("Hi " + name + ", Thank you for using this app.");
        System.out.println("Following Reservation Result: ");
        System.out.println(result);
    }
}