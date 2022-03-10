package NewOopBasic1;

import java.util.Scanner;

public class GoonerNamota {
    public static void main(String[] args) {
        //Declare the Method
        Namota();
    }

    public static void Namota() {
        Scanner input = new Scanner(System.in);
        // int num;
        int n, m;

        System.out.print("Please Enter your initial number: ");
        n = input.nextInt();

        System.out.print("Please Enter your last number: ");
        m = input.nextInt();

        /*for (int i = 1; i <=10 ; i++) {
//         System.out.println(num + "x" + i + num * i);
            System.out.println(num + "x" + i + "=" + num * i);
        }*/

        for (int i = n; i <= m; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + j * i);
            }
            System.out.println("----------------------");
        }
    }
}
