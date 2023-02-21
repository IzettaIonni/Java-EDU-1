package Start_Exercises;

import java.util.Scanner;
public class Input_and_Output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите текст: ");
        String user_str = input.nextLine();

        System.out.println("Введите целое число: ");
        int user_int = input.nextInt();

        System.out.println("Введите дробное число: ");
        double user_double = input.nextDouble();

        System.out.println("Введите маленькое число: ");
        byte user_byte = input.nextByte();

        System.out.println("Введите \"true\" или \"false\": ");
        boolean user_boolean = input.nextBoolean();


        System.out.println("Ваш текст: " + user_str);
        System.out.println("Ваше целое число: " + user_int);
        System.out.println("Ваше дробное число: " + user_double);
        System.out.println("Ваше маленькое число: " + user_byte);
        System.out.println("Ваше значение: " + user_boolean);
    }
}
