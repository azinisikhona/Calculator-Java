import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int num1 = input.nextInt();
        System.out.println("You have entered the number: " + num1);
        
        System.out.println("Enter an operative: ");
        String operative = input.next();
        System.out.println("You have entered the operative: " + operative);
        
        System.out.println("Enter a second integer: ");
        int num2 = input.nextInt();
        System.out.println("You have entered the number: " + num2);

        input.close();
        
        if (operative.equals("+")) {
            int ans = num1 + num2;
            System.out.println("The answer is: " + ans);
        }else if (operative.equals("-")) {
            int ans = num1 - num2;
            System.out.println("The answer is: " + ans);
        }else if (operative.equals("*")) {
            int ans = num1 * num2;
            System.out.println("The answer is: " + ans);
        }else if (operative.equals("/")) {
            if (num2 == 0) {
                System.out.println("Division by zero is undefined");
            }else {
                double ans = (double) num1 / num2;
            System.out.println("The answer is: " + ans);
            }
        }
    }
}
