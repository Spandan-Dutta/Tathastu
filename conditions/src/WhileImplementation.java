/* Create an application which accept numbers from
user an stop when got 3 even numbers*/

import java.util.Scanner;

public class WhileImplementation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = 0;
        while (c != 3) {
            System.out.println("Enter a number");
            int number = s.nextInt();
            if (number % 2 == 0) {
                c++;
            }
        }
        System.out.println("GOt three even numbers");
        s.close();
    }
}
