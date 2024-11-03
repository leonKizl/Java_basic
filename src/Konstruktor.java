public class Konstruktor {
    public String name;
    public int age;

    public Konstruktor(String name, int age){
        System.out.println("Konstruktor" + name +" " + age);
        this.name = name;
        this.age = age;
    }
    public void naming(){
        System.out.println("My name is " + name + "\nMy age is " + age);

    }
}
