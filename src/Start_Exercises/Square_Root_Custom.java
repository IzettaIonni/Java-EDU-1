package Start_Exercises;

import java.util.Scanner;

public class Square_Root_Custom {
    //Solution of this task that i wrote without google
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean is_possible = false;

        System.out.print("Input a number to find it's square: ");
        int a = input.nextInt();
        for(int i = 1; i <= a/2; i++) {
            if(i*i == a) {
                System.out.println("Square root from " + a + " equal " + i);
                is_possible = true;
                break;
            }
        }
        if(!is_possible) {
            System.out.println("This number do not have integer square root");
        }
    }
}
