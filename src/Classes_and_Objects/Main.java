package Classes_and_Objects;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Users Andrey = new Users("Andrey", 332105, 3425);

        System.out.println("Create new account\nInput your username: ");
        String username = input.nextLine();

        System.out.println("Input your id: ");
        int userid = input.nextInt();

        System.out.println("Input your passcode: ");
        int userpasscode = input.nextInt();

        Users newuser = new Users(username, userid, userpasscode);

        System.out.print("login to " + newuser.name + " account with id: " + newuser.id + "\nPlease enter passcode: ");

        while(true) {
            int trypass = input.nextInt();

            if(trypass == newuser.passcode) {
                System.out.println("You logged in");
                break;
            }
            else
                System.out.print("passcode is incorrect\nPlease, try again: ");
        }
    }
}
