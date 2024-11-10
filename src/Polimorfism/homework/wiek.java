package Polimorfism.homework;

public class wiek {
    public int age;



    public void get_age(int age) throws InvalidAgeExeption {
        if (age <= 0){
            throw new InvalidAgeExeption("Invalid age");
        } else if (age > 0 && age < 18) {
            System.out.println("You are under 18");
        } else {
            System.out.println("Wha d u wanr");
        }
        this.age = age;
    }
    public void get_discr() {
        System.out.println("Your age is " + age);
    }

    public static void main(String[] args) throws InvalidAgeExeption {
//        wiek test = new wiek();
//        test.get_age(19);
//        test.get_age(17);
//
//        for (int i = 30;i >= 0; i--){
//            System.out.print("Age - " + i);
//            test.get_age(i);
//        }

        wiek[] adultism = new wiek[20];

        for (int i = 18; i > 0;i--){
            adultism[i] = new wiek();
            System.out.println("Your age is " + i);
            adultism[i].get_age(i);
        }
        System.out.println("sefsesef");
        adultism[18].get_discr();

    }

}
