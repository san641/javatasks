/* Use an if-else statement to check if a number is even or odd */
package chapter2;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        scanner.close();
    }
}