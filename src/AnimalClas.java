import java.util.Scanner;

public class AnimalClas {

    public void countTillSto(){
        System.out.println("ENTER");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        for (int i = number;i < 100;i++){
            result = result + i;
        }
        System.out.println(result);
    }
    public int counter(){
        return 23;
    }

    public double add(double num_one,double numb_dwa){
        return num_one + numb_dwa;
    }
    public double sub(double num_one,double numb_dwa){
        return num_one - numb_dwa;
    }
    public double mult(double num_one,double numb_dwa){
        return num_one * numb_dwa;
    }
    public double div(double num_one,double numb_dwa){
        return num_one / numb_dwa;
    }
    public double mod(double num_one,double numb_dwa){
        return num_one % numb_dwa;
    }
}
