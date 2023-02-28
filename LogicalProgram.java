package assignments.LogicalPrograms;


import java.util.Scanner;

public class LogicalProgram {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Logical program");
        LogicalProgram logicalProgram = new LogicalProgram();
        logicalProgram.fibonacciseries();
        logicalProgram.perfectnumber();
        logicalProgram.primenumber();
        logicalProgram.reversegivennumber();
    }

    public void fibonacciseries() {
        System.out.println("Enter fibonacci series Number:");

        int n = scanner.nextInt(); //n-->fiblength
        int firstTerm = 0, secondTerm = 1;


        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    public void perfectnumber() {
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int i = 1;
        int Result  = 0;

        for (i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println(Result );
                Result  = Result  + i;
            }
        }
        if (Result  == n) {
            System.out.println(n + " is a perfect number.");
        } else
            System.out.println(n + " is not a perfect number.");

    }

    public void primenumber(){
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();

        int count = 0;
        int number = 1;
        while (count < n) {
            boolean isPrime = true;
            int initialValue = 2;
            while (initialValue <= number / 2) {
                if (number % initialValue == 0) {
                    isPrime = false;
                    break;
                }
                initialValue++;
            }
            if (isPrime) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public void reversegivennumber(){

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        int reversenum =0, temp = 0;

        while( n > 0 )
        {
            temp = n % 10;
            reversenum = reversenum * 10 + temp;
            n = n/10;
        }

        System.out.println("Reverse of number is: "+reversenum);
    }

}
