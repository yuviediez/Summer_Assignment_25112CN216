import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = Math.abs(num);

        while (temp != 0) {
            sum += temp % 10; // Extract last digit
            temp /= 10;       // Remove last digit
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
