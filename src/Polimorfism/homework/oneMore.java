package Polimorfism.homework;

public class oneMore {
    public int age;

    oneMore(int age) throws InvalidAgeExeption {
        if (age <= 0){
            throw new InvalidAgeExeption("Invalid age");
        } else if (age > 0 && age < 18) {
            System.out.println("You are under 18");
        } else {
            System.out.println("Wha d u wanr");
        }
        this.age = age;
    }
    public void discr(){
        System.out.println(age);
    }

    public static void main(String[] args) throws InvalidAgeExeption {
        oneMore[] sef = new oneMore[20];
        for (int i = 19; i >0; i--){
            System.out.println("Object with age " + i);
            sef[i] = new oneMore(i);
        }

        sef[18].discr();
    }
}


