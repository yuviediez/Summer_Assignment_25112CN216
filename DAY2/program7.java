import java.util.Scanner;

public class program7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        int temp = Math.abs(num);

        while (temp != 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        System.out.println("Product of digits = " + product);

        sc.close();
    }
}