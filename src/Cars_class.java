public class Cars_class extends Students_class {
    public String marka;
    public int year;
    public String color;
    public String owner;
    public double price;
    public double your_salary;
    public double you_have;
    public static String wagen = "Auto";

    public Cars_class(){

    }
    public Cars_class(String marka, int year, String color, String owner, double price, double your_salary, double you_have){
        this.marka = marka;
        this.year = year;
        this.color = color;
        this.owner = owner;
        this.price = price;
        this.your_salary = your_salary;
        this.you_have = you_have;
    }
    public static void InfoMasziny(){
        System.out.println("!!!!!!!!!!!!!!!!!!!!\nITS A SOUT!!!!! " + wagen);
        int i = 0;
        while (i < 10){
            System.out.println("TY  KOZEL JEBUCZU" + i);
            i++;
        }
    }

    public void description(){
        System.out.println("My cars is "+color+" " + marka + ". Its a " + wagen);
    }
    public void details(){
        System.out.println("Year - " + year + ". Owner - " + owner);
    }

    public void put_of() {
        for (double i = you_have;i <= price;i = i +your_salary){
            System.out.println("in one month you wil have " + i);
        }
    }
}
