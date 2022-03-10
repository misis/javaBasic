package NewOopBasic1;

import java.util.Scanner;

public class CopyGoonerNamota {
    public static void main(String[] args) {
    //  Declare the Method
        copyNamota();
    }

    public static void copyNamota(){
        Scanner input = new Scanner(System.in);
        int n , m;

        System.out.print("Please Enter a initial number: ");
        n = input.nextInt();

        System.out.print("Please Enter a last number: ");
        m = input.nextInt();

        for (int i = n; i <= m ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println("----------------");
        }
    }
}
