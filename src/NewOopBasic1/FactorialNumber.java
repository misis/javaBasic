package NewOopBasic1;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        // ** Declare the Method **
        factorial_num();

    }

    public static void factorial_num(){

        Scanner input = new Scanner(System.in);
        int num, fact = 1;

        System.out.print("Please Enter a positive integer number: ");
        num = input.nextInt();

        for (int i = num; i >= 1 ; i--) {
            System.out.print(i + "X" + i + " ");
            fact = fact * i;
        }
        System.out.println("");
        System.out.println("Yor gave " + num +  " and the result is : " + fact);

    }
}
