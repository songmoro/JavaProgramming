package JavaProgramming;

import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("몸무게 : ");
        int weight = input.nextInt();
        System.out.println("키(실수) : ");
        float height = input.nextFloat();

        System.out.println("몸무게 = " + weight + ", 키 = " + height);
    }
}
