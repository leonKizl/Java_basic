import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextDouble();
        System.out.println("Enter second number");
        double secondNum = scanner.nextDouble();

        System.out.println("Summa = " + (firstNum + secondNum));
    }
}
