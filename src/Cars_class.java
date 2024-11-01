public class Cars_class {
    public String marka;
    public int year;
    public String color;
    public String owner;
    public double price;
    public double your_salary;
    public double you_have;

    public void description(){
        System.out.println("My cars is "+color+" " + marka);
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
