package assignments.LogicalPrograms;

import java.util.Scanner;

public class LogicalProgram2 {
    static Scanner scanner = new Scanner(System.in);
    int i=0;
    static int total=0;
    static int[] notes = { 1000,500,100,50,10,5,2,1};


    public static void main(String[] args) {
        LogicalProgram2 logicalProgram = new LogicalProgram2();
        logicalProgram.vendingmachine(scanner.nextInt(), notes);
        System.out.println("Total Number of Notes are :"+total);

    }
    public int vendingmachine(int money, int[]notes ) {
        int rem;
        if(money==0)
        {
            return -1;
        }
        else
        {
            if(money>=notes[i])
            {
                // logic for Calculating The notes
                int calNotes =money/notes[i];
                rem = money%notes[i];
                money =rem;
                total += calNotes;
                System.out.println(notes[i]+   " Notes ---> " +calNotes );
            }
            i++;
            return vendingmachine(money, notes);
        }
    }

}
