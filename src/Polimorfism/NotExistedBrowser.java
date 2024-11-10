package Polimorfism;

public class NotExistedBrowser extends Exception{
    NotExistedBrowser(String message){
        super(message);
    }
    NotExistedBrowser(){
        super();
    }
}
