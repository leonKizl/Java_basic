package Polimorfism;

public class test {
    static Browser browserSelector(String browserNmae) throws BrowserNotFound, NotExistedBrowser {
        if (browserNmae.equals("Chrome")){
            return new GChrome();
        } else if (browserNmae.equals("Opera")) {
            return new Opera();
        }else throw new NotExistedBrowser();
    }

    public static void main(String[] args) throws BrowserNotFound, NotExistedBrowser {
        Browser firstTest = test.browserSelector("Chrome");
        Browser secondTest = test.browserSelector("Opera");
        Browser thirdTest = test.browserSelector("Yandex");
//        Browser[] testiara = new Browser[]{new GChrome(), new Opera()};
//
//        for (Browser browser:testiara){
//            browser.description();
//        }

    }
}
