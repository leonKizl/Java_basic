import java.util.Scanner;

public class OperatoryPorownania {
    public static void main(String[] args) {
        System.out.println("Enter 2 number over enter (first more than second");
        Scanner scanner = new Scanner(System.in);
        double firNum = scanner.nextDouble();
        double secNum = scanner.nextDouble();

        boolean prawda = (firNum + secNum)>2;
        boolean nieprawda = (firNum + secNum)<2;
        boolean lorz = firNum < secNum;
        boolean nielorz = firNum > secNum;

        System.out.println("Probably true " + (prawda && nielorz));
        System.out.println("Probably false " + (prawda && lorz));
        System.out.println("Reverse from first " + !(prawda && nielorz));
    }
}
