package Classes_and_Objects;
public class Users {
    public String name;
    public int id;
    public int passcode;

    public Users(String input_name, int input_id, int input_passcode) {
        System.out.println("User created!");
        add_user(input_name, input_id, input_passcode);
    }
    private void add_user(String input_name, int input_id, int input_passcode) {
        name = input_name;
        id = input_id;
        passcode = input_passcode;
    }

    public String get_user() {
        String user_info = "Username: " + name + '\n' + "id: " + id + '\n';
        return user_info;
    }
}
