package PntClass10thJava;

import java.util.Scanner;

public class UpperAndLower {
    public static void main(String[] args) {
        UpperAndLower myObj = new UpperAndLower();
        //String name = myObj.Upperinput();
        System.out.println(myObj.Upperinput());
    }
    public String Upperinput(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please Write your name: ");
        String takeUpper = input.nextLine();
        return (takeUpper.toUpperCase());
        // System.out.println(takeUpper.toLowerCase());
    }
}
