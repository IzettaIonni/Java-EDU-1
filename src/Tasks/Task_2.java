package Tasks;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Task_2 {
    public static List<Integer> generate_random_array(int maxSize) {
        if(maxSize < 2 || maxSize >= 15) {
            throw new IllegalArgumentException("maxSize out of range");
        }

        Set<Integer> a = new HashSet<>();
        while(a.size() < maxSize) {
            a.add(ThreadLocalRandom.current().nextInt(0, 15)); //0 - 99
        }
        List<Integer> b = new ArrayList<>(a);
        Integer exepected_result = null;
        for(Integer x : a) {
            if(exepected_result == null)
                exepected_result = x;
            else
                b.add(x);
        }
        Collections.shuffle(b);
        return b;
    }

    public static String convertIntegerToBinary(int n) {
        if (n == 0) {
            return "0000";
        }

        StringBuilder binaryNumber = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binaryNumber.append(remainder);
            n /= 2;
        }

        while(binaryNumber.length() < 4)
            binaryNumber.append('0');

        binaryNumber = binaryNumber.reverse();
        return binaryNumber.toString();
    }
    public static void main(String[] args) {
        var b = generate_random_array(5);

        int r = b.get(0);
        for(int i = 1; i < b.size(); i++) {
            System.out.println("current r is " + r);
            System.out.println("what equals: ");
            System.out.println(convertIntegerToBinary(r));
            System.out.println("next number is " + b.get(i));
            System.out.println("what equals: ");
            System.out.println(convertIntegerToBinary(b.get(i)));
            r = r ^ b.get(i);
            System.out.println("result of XOR is: " + r);
            System.out.println("what equals: ");
            System.out.println(convertIntegerToBinary(r) +"\n\n");
        }
        System.out.println("Array equals " + b);
        System.out.println("Actual result: " + r);

        // or = |
        // xor = ^
        // and = &
        /*
        1010
        0100
         ==
         or
        1110
        1110

         and
        0000
        0000

         xor
        1110
        1010

        https://habr.com/ru/company/vdsina/blog/538298/
         */
    }
}
