public class objects {

    public static void main(String[] args) {

        Students_class wika = new Students_class();
        wika.name = "Wika";
        wika.LastName = "Yarosh";
        wika.age = 26;
        wika.course = 4;

        wika.get_name();
        wika.get_age();
        wika.clas();

        wika.name = "swinika";
        wika.get_name();

        Students_class leon = new Students_class();
        leon.name = "LEON";
        leon.get_name();
        leon.get_age();

        Cars_class maszina = new Cars_class();
        maszina.owner = "Leon";
        maszina.marka = "Toyota";
        maszina.color = "Black";
        maszina.year = 2020;
        maszina.details();
        maszina.description();


    }
}
