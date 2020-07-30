import java.util.Scanner;

// Declare,initialize and and print an array.
public class ArrayImplementation {
    public static void main(String[] args) {
        //declare an array
        int[] arr;
        // create or initialize
        arr = new int[5];
        //printing an array to check default value
        System.out.println("Default Values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println();
        // one way
        arr[0] = 200;
        // second way user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        arr[1] = sc.nextInt();
        // initialize using for loop
        System.out.println("ENter 5 integers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //printing array after user input
        System.out.println("User input");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println();
    }
}
