import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();

        // Call the function to print Armstrong numbers in the range
        printArmstrong(lower, upper);

        scanner.close();
    }

    // Function to print all Armstrong numbers in the range
    public static void printArmstrong(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) { // Corrected loop condition
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }
}
