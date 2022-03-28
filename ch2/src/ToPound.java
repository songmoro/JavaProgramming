package JavaProgramming;

import java.util.*;

public class ToPound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("몸무게 : ");
        float weight = input.nextFloat();
        System.out.println("몸무게(kg) = " + weight);
        System.out.println("몸무게(파운드) = " + (float)(weight * 2.2));
    }
}
