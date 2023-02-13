import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        //loop for
        int c = 0;
        for(int i = 1; i < 10; i++) {
            System.out.print(i+" + ");
            c += i;
        }
        c += 10;
        System.out.print("10 = ");
        System.out.println(c);

        //while
        Random random = new Random();
        int x = random.nextInt(100)+1;

        boolean found = false;
        int check = 1;
        while(!found) {
            if(check == x) {
                break;
            }
            ++check;
        }
        System.out.println(check);
    }
}
