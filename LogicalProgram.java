package assignments.LogicalPrograms;


import java.util.Scanner;

public class LogicalProgram {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Logical program");
        LogicalProgram logicalProgram = new LogicalProgram();
        logicalProgram.fibonacciseries();


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

}
