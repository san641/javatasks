/* 12 */
package chapter3;
import java.util.Scanner;
public class sumofnaturalnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
        scanner.close();
    }
}