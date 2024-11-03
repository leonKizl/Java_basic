import java.util.Scanner;

public class AnimalsMetod {

    public static void main(String[] args) {
//        AnimalClas kozel = new AnimalClas();
//        kozel.countTillSto();
//        int kozelNumber = kozel.counter();
//        System.out.println(kozelNumber);
//
//        Scanner scanner = new Scanner(System.in);
//        double num_one = scanner.nextDouble();
//        double num_dwa = scanner.nextDouble();
//        System.out.println("additioanal " + kozel.add(num_one,num_dwa));

        Konstruktor dinamit = new Konstruktor("kozel", 29);
        dinamit.naming();
        System.out.println(dinamit.name + dinamit.age);

        Cars_class taczka = new Cars_class("Opel", 2020, "black", "Leon", 10000, 1500, 500);
        Cars_class maszina = new Cars_class();
        maszina.marka = "sefsef";
        System.out.println(taczka.wagen);
        taczka.put_of();
        taczka.description();
        taczka.details();

        String[] spisok = new String[5];
            spisok[0] = "Matem";
            spisok[1] = "rusk jaz";
            spisok[2] = "liter";
            spisok[3] = "Istor";
            spisok[4] = "poslednij";

        for (int i = 0; i < spisok.length/2; i++){
            String head = spisok[i];
            spisok[i] = spisok[spisok.length - 1 -i];
            spisok[spisok.length - 1 - i] = head;
        }
        for (int i = 0; i < spisok.length; i++){
            System.out.println(spisok[i]);
        }
        maszina.InfoMasziny();
        taczka.name = "Opel";
        taczka.LastName = "Astra";
        taczka.get_name();

        Students_class swinudent = new Students_class();
        swinudent.age = 16;
        swinudent.name = "Wika";
        swinudent.NewString(swinudent.age);


    }}
