package assignments.LogicalPrograms;

import java.util.Scanner;

public class LogicalProgram2 {
    static Scanner scanner = new Scanner(System.in);
    int i = 0;
    static int total = 0;
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};


    public static void main(String[] args) {
        LogicalProgram2 logicalProgram = new LogicalProgram2();
        logicalProgram.vendingmachine(scanner.nextInt(), notes);
        System.out.println("Total Number of Notes are :" + total);

        System.out.println("Enter date, month and year:");
        dayOfweek(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        temperatureconversion();

        System.out.println("Please Enter the Principal Amount,Years and Rate :");
        monthlypayment(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

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

}
