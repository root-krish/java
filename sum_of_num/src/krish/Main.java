package krish;

import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A:");
        int A=sc.nextInt();

        System.out.print("Enter B:");
        int B = sc.nextInt();

        System.out.println("Result(A+B)="+(A+B));

    }
}