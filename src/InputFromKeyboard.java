import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextDouble();
        System.out.println("Enter second number");
        double secondNum = scanner.nextDouble();

        System.out.println("Addition = " + (firstNum + secondNum));
        System.out.println("Substraction = " + (firstNum - secondNum));
        System.out.println("Multiplikacion = " + (firstNum * secondNum));
        System.out.println("Division = " + (firstNum/secondNum));
        System.out.println("Modulo = " + (firstNum%secondNum));
    }
}
