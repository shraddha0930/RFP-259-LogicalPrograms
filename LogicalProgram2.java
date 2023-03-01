package assignments.LogicalPrograms;

import java.util.Scanner;

public class LogicalProgram2 {
    static Scanner scanner = new Scanner(System.in);
    int i = 0;
    static int total = 0;
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};


    public static void main(String[] args) {
        System.out.print("Enter the option: ");
        int option = scanner.nextInt();

        LogicalProgram2 logicalProgram = new LogicalProgram2();

        switch (option){
            case 1:
                logicalProgram.vendingmachine(scanner.nextInt(), notes);
                System.out.println("Total Number of Notes are :" + total);
                break;
            case 2:
                System.out.println("Enter date, month and year:");
                dayOfweek(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                break;
            case 3:
                temperatureconversion();
                break;
            case 4:
                System.out.println("Please Enter the Principal Amount,Years and Rate :");
                monthlypayment(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                break;
            case 5:
                sqrt();
                break;
            case 6:
                toBinary(scanner.nextInt());
                break;
            default:
                System.out.println("Invalid option!");

        }

    }

    public int vendingmachine(int money, int[] notes) {
        int rem;
        if (money == 0) {
            return -1;
        } else {
            if (money >= notes[i]) {
                // logic for Calculating The notes
                int calNotes = money / notes[i];
                rem = money % notes[i];
                money = rem;
                total += calNotes;
                System.out.println(notes[i] + " Notes ---> " + calNotes);
            }
            i++;
            return vendingmachine(money, notes);
        }
    }

    public static void dayOfweek(int d, int m, int y){

        int y0 = y - (14 - m) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        String DaysArray[] = {"Sunday ", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(DaysArray[d0]);
    }

    public  static void temperatureconversion(){

        int fahrenheit,celsius;
        System.out.println("Please Enter the Your Choice 1.Celsius or 2.Fahrenheit");
        int choice = scanner.nextInt();

        switch(choice)
        {
            case 1:

                System.out.println("Enter the temperature in Fahrenheit:");
                fahrenheit = scanner.nextInt();
                celsius = (fahrenheit - 32 ) * 5 / 9;
                System.out.println("The temperature in Celsius is :" + celsius);
                break;

            case 2:

                System.out.println("Enter the temperature in Celsius:");
                celsius = scanner.nextInt();
                fahrenheit = ( celsius * 9 / 5 ) + 32 ;
                System.out.println("The temperature in Fahrenheit is :" + fahrenheit);
                break;
        }
    }

    public static void monthlypayment(double P, double Y,double R){
        double n = 12 * Y;
        double r = R / ( 12 * 100 );

        double MonthPayment = (P * r )/ (1 - (Math.pow((1+r), (-n)) ));
        System.out.println(" The Payment Per Month is : " + MonthPayment);

    }

    public static void sqrt(){
        double c = scanner.nextDouble();
        double epsilon = 1e-15;    // relative error tolerance
        double t = c;              // estimate of the square root of c

        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
    }

    public static int[] toBinary(int d) {

        String sbinary = "";
        while (d != 0) {
            sbinary = (d % 2) + sbinary;
            d /= 2;
        }
        while (sbinary.length() % 4 != 0) {
            sbinary = 0 + sbinary;
        }
        return stringToIntArray(sbinary);
    }
    public static int[] stringToIntArray(String sbinary) {
        int[] binary = new int[sbinary.length()];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = sbinary.charAt(i) - 48;
        }
        return binary;
    }
    public static int toDecimal(int[] binary) {
        int dec = 0, j = 0;
        for (int i = binary.length - 1; i >= 0; i--) {
            if (binary[i] == 1) {
                dec = dec + (int) Math.pow(2, j);
            }
            j++;
        }
        return dec;
    }

}
