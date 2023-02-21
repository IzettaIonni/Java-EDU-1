package Start_Exercises;

public class Arrays {
    public static void main(String[] args) {
        //start_exercises.Arrays
        int[] arr = new int[] {1, 5, 7, 12, 2, 4};

        System.out.println("Array");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int l = arr.length;
        System.out.println("\nReversed");
        for(int i = l - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nMax element");
        int m = arr[0];
        for(int i = 1; i < l; i++) {
            if(m < arr[i]) m = arr[i];
        }
        System.out.println(m);

        System.out.println("Min element");
        int n = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(n > arr[i]) n = arr[i];
        }
        System.out.println(n);

        char[][] darr = new char[][] {
                {'h', 'e', 'l', 'l', 'o'},
                {'w', 'o', 'r', 'l', 'd'}
        };

        System.out.println("2d array");
        System.out.println('{');
        for(int i = 0; i < darr.length; i++) {
            System.out.print('{');
            for(int j = 0; j < darr[1].length-1; j++) {
                System.out.print(darr[i][j] + " ");
            }
            System.out.println(darr[i][4] + "}");
        }
        System.out.println('}');
    }
}
