/*
 * 내용 : 상수와 그 표현을 살펴보는 프로그램
 */

package JavaProgramming;

public class HelloLiterals {
    static long creditCardNumer = 1234_5678_9012_3456L;
    static long socialSecurityNumber = 999_99_9999L;
    static float pi = 3.14_15F;

    public static void main(String[] args) {
        System.out.println(0b1010); // 이진수
        System.out.println(016); // 8진수
        System.out.println(0x1F); // 16진수
        System.out.println(3.14f); // float형
        System.out.println(3.1415D); // double형
        System.out.println(creditCardNumer);
        System.out.println(socialSecurityNumber);
        System.out.println(pi);
    }
}
