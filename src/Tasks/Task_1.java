package Tasks;

public class Task_1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 55;
        b = a + b; //b = 75, a = 20
        a = b - a; //a = 75 - 20 = 55, b = 75
        b = b - a; //b = 75 - 55 = 20, a = 55
        System.out.println("a equals " + a + ", b equals " + b);

        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a equals " + a + ", b equals " + b);
    }
}
