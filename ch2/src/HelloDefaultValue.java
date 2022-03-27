/*
 * 내용 : 필드와 지역변수의 초기 값 체크 프로그램
 */

package JavaProgramming;

public class HelloDefaultValue {
    // 필드 선언
    static int def; // 현재 static을 빼면 문법 오류 발생
    static boolean bool; // 현재 static을 빼면 문법 오류 발생
    static String name; // 현재 static을 빼면 문법 오류 발생

    public static void main(String[] args) {
        // 지역 변수 선연
        int n = 100;
        System.out.println(n);

        // 필드 사용 가능
        System.out.println(def);
        System.out.println(bool);
        System.out.println(name);
    }
}
