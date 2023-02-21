package Start_Exercises;

import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите 2 числа: ");
        int a = input.nextInt();
        int b = input.nextInt();

        if(is_odd(a)) System.out.println("Первое число нечетное");
        if(is_even(a)) System.out.println("Первое число четное");
        if(is_odd(b)) System.out.println("Второе число нечетное");
        if(is_even(b)) System.out.println("Второе число четное");

        System.out.println("Сумма этих чисел равна " + sum(a, b));
    }

    //return true if number is odd and false if not
    public static boolean is_odd(int x) {
        if(x % 2 != 0) return true;
        else return false;
    }


    //return true if number is even and false if not
    public static boolean is_even(int x) {
        if(x % 2 == 0) return true;
        else return false;
    }

    //return summary of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    //short version of System.out.println()
    public static void print(String str) {
        System.out.println(str);
    }
}
