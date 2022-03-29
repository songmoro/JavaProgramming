package JavaProgramming;

public class IncDecOP {
    public static void main(String[] args) {
        int m = 50, n = 30;

        System.out.printf("%d %d %n", m--, n++); // 50 30
        System.out.printf("%d %d %n", m, n); // 49 31
        System.out.printf("%d %d %n", --m, ++n); // 48 32
        System.out.printf("%d %d %n", m, n); // 48 32
    }
}
