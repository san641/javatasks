/* Write a program to print the multiplication table of a number using a for loop */
package chapter2;
import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}