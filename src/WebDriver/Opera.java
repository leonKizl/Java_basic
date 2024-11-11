package WebDriver;

public class Opera extends Driver{
    public static String name = "Opera";
    Opera(){
        System.out.println(name);
    }
    @Override
    public void discription() {
        System.out.println("You are in " + name);
    }
}
