
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exeptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte a = 1;
        byte b = 1;

        System.out.println("Введите делимое в промежутке от -128 до 127");
        try {
            a = input.nextByte();
        }
        catch(InputMismatchException exc) {
            System.out.println("Формат данных не совпадает с условиями");
        }
    }
}
