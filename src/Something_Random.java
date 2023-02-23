public class Something_Random {
    public static String convertIntegerToBinary(int n) {
        if (n == 0) {
            return "0000";
        }
        StringBuilder binaryNumber = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binaryNumber.append(remainder);
            n /= 2;
        }
        while(binaryNumber.length() < 4)
            binaryNumber.append('0');
        binaryNumber = binaryNumber.reverse();
        return binaryNumber.toString();
    }
    public static void main(String[] args) {
        int r = 1;
        System.out.println(r);
        r = r ^ 5;
        System.out.println(r);
        r = r ^ 7;
        System.out.println(r);
        r = r ^ 1;
        System.out.println(r);
        r = r ^ 7;
        System.out.println(r);
    }
}
/*

 */