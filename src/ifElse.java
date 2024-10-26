import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextDouble();
        double secNum = scanner.nextDouble();

        if (firstNum > secNum){
            System.out.println("first number greater than second");
        } else {
            System.out.println("second number is greater than first one");
        }
    }
}
