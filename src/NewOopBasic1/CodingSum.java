package NewOopBasic1;

import java.util.Scanner;

public class CodingSum {
    public static void main(String[] args) {
        //Declare the method
        sum_of_num();
    }

    //Declare the first OOP
    public static void sum_of_num(){
       Scanner input = new Scanner(System.in);
       int sum = 0;

        System.out.print("Please Enter initial number: ");
        int m = input.nextInt();

        System.out.print("Please Enter a number from where to go: ");
        int n = input.nextInt();

        /*System.out.println("sum of number, which two number you want to input.");
        for (int i = m; i <= n ; i++) {
            System.out.print(""+ i );
            sum = sum + i;
        }

        System.out.println("sum of even/even num, which two number you want to input.");
        for (int i = m; i <= n ; i = i + 2) {
            System.out.print( i + ", ");
            sum = sum + i;
        }*/

        System.out.println("Multiply of num, which two number you want to input.");
        for (int i = 0; i <= n ; i = i + 1) {
            System.out.print( i + "X" + i + " ");
            sum = sum + i * i;
        }



        System.out.println("");
        System.out.println("Result of number: " + sum);
    }
}
