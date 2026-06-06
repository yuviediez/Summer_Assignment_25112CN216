import java.util.Scanner;

public class program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp > 0) {
            count += temp & 1; // Check last bit
            temp >>= 1;        // Right shift by 1
        }

        System.out.println("Number of set bits = " + count);

        sc.close();
    }
}