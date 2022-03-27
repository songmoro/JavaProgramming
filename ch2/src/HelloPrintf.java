package JavaProgramming;

public class HelloPrintf {
    public static void main(String[] args) {
        System.out.println("123456 123456 123456");
        System.out.println("--------------------");
        System.out.format("%6d %6o %6h %n", 10, 10, 10); // 10을 십진수, 8진수, 16진수로 출력
        System.out.format("%-6d %-6o %-6x %n", 20, 20, 20); // 20을 왼쪽 정렬로 출력
        System.out.format("%+6d %6o %6x %n", 30, 30, 30); // 30을 + 부호가 표시되도록 출력
        System.out.format("%1$6d %1$6o %1$6x %n", 128); // 인자 128 하나로 여러 진법으로 출력
        System.out.printf("%1$6.2f %1$6.3f %1$6.4f %n", 3.141592); // 실수를 다양한 폭으로 출력
    }
}
