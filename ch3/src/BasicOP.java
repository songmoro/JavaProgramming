package JavaProgramming;

public class BasicOP {
    public static void main(String[] args) {
        int day, remainder;
        day = remainder = 365; // day = (remainder = 365);
        int week = 365 / 7; // 정수/정수 결과는 정수

        System.out.format("1년은 %d일이며 %d주이다.%n", day, week);
        System.out.println(remainder %= 7);
        // remainder에 저장되는 값이 결과 값
        System.out.println(remainder); // 위 결과와 일치
    }
}
