import java.util.Scanner;

public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int divide(int num1, int num2) {
        int ans = num1 / num2;
        return ans;
    }

    static int multiply(int num1, int num2) {
        int ans = num1 * num2;
        return ans;
    }

    static int subtract(int num1, int num2) {
        int ans = num1 - num2;
        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to my Calculator App");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            System.out.print("Enter your choice -> ");
            int choice = scn.nextInt();

            if (choice == 0) {
                System.out.println("Exiting Program ...");
                break;
            }
            System.out.println("Enter your first number: ");

            int num1 = scn.nextInt();
            System.out.println("Enter your second number: ");
            int num2 = scn.nextInt();
            int result;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    continue;
            }
            System.out.println("Final result is " + result);
        }
        scn.close();
    }
}