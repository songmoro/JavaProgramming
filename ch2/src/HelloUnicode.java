/*
 * 내용 : 문자와 특수 문자의 표현 방법을 알아보는 프로그램
 */

package JavaProgramming;

public class HelloUnicode {
    public static void main(String[] args) {
        System.out.println('a'); // 일반 문자
        System.out.println('\\'); // 특수 문자
        System.out.println('\142'); // 코드 값 8진수 표현
        System.out.println('\uAC00'); // 코드 값 16진수
        System.out.println('\uAC01'); // 코드 값 16진수
        System.out.println('강'); // 일반 문자
    }
}
