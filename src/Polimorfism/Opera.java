package Polimorfism;

public class Opera extends Browser{
    @Override
    public void description() {
        System.out.println("You are in Opera");
    }
    Opera(){
        System.out.println("Opera created");
    }
}
