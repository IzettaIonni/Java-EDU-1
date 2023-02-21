package Start_Exercises;

import java.util.Random;

public class Conditional_Statements {
    public static void main(String[] args) throws InterruptedException {
        // if/else statements
        System.out.println("Создается случайное число");

        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(500);
        System.out.println("..");
        Thread.sleep(500);
        System.out.println("...");
        Thread.sleep(500);

        System.out.println("Случайное число в промежутке от 1 до 10 создано");
        Thread.sleep(500);
        System.out.println("Вычисляю число");

        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(500);
        System.out.println("..");
        Thread.sleep(500);
        System.out.println("...");
        Thread.sleep(500);

        Random random = new Random();
        int x = random.nextInt(10)+1;

        if(x <= 3) {
            System.out.println("Число в помежутке от 1 до 3");
        }
        else if(x <= 6) {
            System.out.println("Число в промежутке от 3 до 6");
        }
        else {
            System.out.println("Число в промежутке от 7 до 10");
        }

        Thread.sleep(500);
        System.out.println("Провераю варианты чисел в заданном промежутке");

        Thread.sleep(500);
        System.out.println(".");
        Thread.sleep(500);
        System.out.println("..");
        Thread.sleep(500);
        System.out.println("...");
        Thread.sleep(500);

        // switch/case statements

        switch (x) {
            case 1:
                System.out.println("Число равняется 1");
                break;
            case 2:
                System.out.println("Число равняется 2");
                break;
            case 3:
                System.out.println("Число равняется 3");
                break;
            case 4:
                System.out.println("Число равняется 4");
                break;
            case 5:
                System.out.println("Число равняется 5");
                break;
            case 6:
                System.out.println("Число равняется 6");
                break;
            case 7:
                System.out.println("Число равняется 7");
                break;
            case 8:
                System.out.println("Число равняется 8");
                break;
            case 9:
                System.out.println("Число равняется 9");
                break;
            case 10:
                System.out.println("Число равняется 10");
                break;
        }
    }
}