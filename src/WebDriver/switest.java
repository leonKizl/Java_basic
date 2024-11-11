package WebDriver;

public class switest  {

    public static void main(String[] args) {
        swintuziara wika = new swintuziara();
        wika.message();

        swintuziara newSwin = new swintuziara(){
            @Override
            public void message() {
                System.out.println("Hello from anon class");
            }
        };
        wika.message();
        newSwin.message();
        wika.message();
        swintuziara desfe = new swintuziara(){
            @Override
            public void message() {
                System.out.println("KJK");
            }
        };
        desfe.message();
        newSwin.message();
    }
}
