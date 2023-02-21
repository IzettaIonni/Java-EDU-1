package Start_Exercises;

public class Variables_and_Data_Types {
    public static void main(String[] args) {
        // creating variable: data type + name of variable + data(optional)
            int number = 22;
            System.out.println(number);

        // Data Types:
            // for integer numbers:
                // byte in range -128 -> 127 , takes 1 byte
                    byte a = 127;
                // short in range -3278 -> 32767 , takes 2 bytes
                    short b = 32767;
                // int in range -2 147 483 648 to 2 147 483 647 , takes 4 bytes
                    int c = 2147483647;
                // long in range -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807 , takes 8 bytes

            // for float numbers
                // float for contain decimal fractions numbers, takes 4 bytes, must contain "f" at the end of number
                    float d = 1.123456789f;
                // double for contain bigger decimal fractions numbers, takes 8 bytes, do not need f at the end
                    double e = 1.1234567890987654321d;

            // for strings
                // char contains one symbol and uses ''
                    char f = '&';
                // String contains string data and uses ""
                    String g = "wasd";

            // for booleans
                // boolean
                    boolean h = false;
    }
}