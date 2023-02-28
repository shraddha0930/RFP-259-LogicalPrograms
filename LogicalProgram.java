package assignments.LogicalPrograms;


import java.util.Scanner;

public class LogicalProgram {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Logical program");
        LogicalProgram logicalProgram = new LogicalProgram();
        logicalProgram.fibonacciseries();
        logicalProgram.perfectnumber();
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

}
