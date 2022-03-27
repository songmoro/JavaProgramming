/*
 * 내용 : 변수의 선언과 초기 값 대입 프로그램
 */

package JavaProgramming;

public class HelloVar {
    public static void main(String[] args) {
        byte b = 0xA;
        short s = 32767; // 32768은 문법 오류 발생
        long distance = 1500_00_000000L; // 21억을 초과하므로 L은 반드시 필요
        double d = 1500e8D; // 정수형이 아님에 주의
        // 변수 x는 사용하지 않으므로 경고 발생
        int x, y = 10, z = 20; // int형의 여러 변수 선언

        System.out.println(b);
        System.out.println(s);
        System.out.println(distance);
        System.out.println(d);
        System.out.println(y);
        System.out.println(z);
    }
}
