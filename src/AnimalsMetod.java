import java.util.Scanner;

public class AnimalsMetod {

    public static void main(String[] args) {
        AnimalClas kozel = new AnimalClas();
        kozel.countTillSto();
        int kozelNumber = kozel.counter();
        System.out.println(kozelNumber);

        Scanner scanner = new Scanner(System.in);
        double num_one = scanner.nextDouble();
        double num_dwa = scanner.nextDouble();
        System.out.println("additioanal " + kozel.add(num_one,num_dwa));


    }
}
