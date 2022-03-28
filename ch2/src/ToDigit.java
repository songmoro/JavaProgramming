package JavaProgramming;

import java.util.Scanner;

public class ToDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("정수 : ");
        int a = input.nextInt();
        System.out.printf("10진수 = %d, 8진수 = %o, 16진수 = %x", a, a, a);
    }
}
