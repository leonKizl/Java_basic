import java.util.Scanner;

public class objects {

    public static void main(String[] args) {

        Students_class wika = new Students_class();
        wika.name = "Wika";
        wika.LastName = "Yarosh";
        wika.age = 26;
        wika.course = 4;

        Students_class leon = new Students_class();
        leon.name = "LEON";
        leon.LastName = "Kozlowski";
        leon.age = 29;
        leon.course = 4;

        Students_class nikita = new Students_class();
        nikita.name = "Nikita";
        nikita.LastName = "Pidowowski";
        nikita.age = 30;
        nikita.course = 5;

        Students_class lana = new Students_class();
        lana.name = "Lana";
        lana.LastName = "KOT";
        lana.age = 3;
        lana.course = 1;

        Students_class[] gruppa = new Students_class[]{wika,leon,nikita,lana};

        for (int i = 0; i < gruppa.length;i++){
            gruppa[i].get_name();
        }

        System.out.println("Reverse");

        for (int j = 0;j < gruppa.length/2;j++) {
            Students_class tempo = gruppa[j];
            gruppa[j] = gruppa[gruppa.length - 1 - j];
            gruppa[gruppa.length - 1 - j] = tempo;
        }

        for (int j = 0; j < gruppa.length; j++){
            gruppa[j].get_name();
            gruppa[j].get_age();
        }

        int indexd = 0;

        System.out.println("WHILE");
        while (indexd < gruppa.length){
            gruppa[indexd].get_name();
            System.out.println(gruppa[indexd].name + " - name");
            indexd++;
        }

        System.out.println("reverse while");

        int l = 0;
        while (l < gruppa.length/2){
            Students_class firstVariable = gruppa[l];
            gruppa[l] = gruppa[gruppa.length - 1 -l];
            gruppa[gruppa.length - 1 - l] = firstVariable;
            l++;

        }
        l = 0;
        while (l < gruppa.length){
            gruppa[l].get_name();
            l++;
        }
        }








    }

