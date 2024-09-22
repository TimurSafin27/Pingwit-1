package org.example.lec_1;

public class OperatorsExample {
    public static void main(String[] args) {
        byte num_1 = 100;
        byte num_2 = 100;

        int sum = num_1 + num_2;
        System.out.println(sum);

        int num_3 = 150;
        sum = sum + num_3;
        System.out.println(sum);

        long num_4 = 200;
        long longSum = sum + num_4;
        System.out.println(longSum);

        longSum += num_4;
        System.out.println(longSum);

        longSum++;
        ++longSum;
        System.out.println(longSum);
        System.out.println(longSum++);
        System.out.println(longSum);
        System.out.println(++longSum);
        System.out.println(longSum);
        longSum--;
        --longSum;

        sum = sum * 2;
        System.out.println(sum);
        sum *=2;
        System.out.println(sum);

        sum/=2;
        System.out.println(sum);

        int three = 3;
        int result = three/2;
        System.out.println(result);

        System.out.println(5 % 3);
        System.out.println(3 % 5);

        System.out.println(3 << 2);
        System.out.println(8 << 3);

        System.out.println(8 >> 2);

        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(3 < 2);
        System.out.println(3 > 2);
    }
}
