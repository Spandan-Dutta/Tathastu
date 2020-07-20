/* Accept a number and print its table */

import java.util.Scanner;

public class forImplementaion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = s.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(number * i);
        }
        s.close();
    }

}
