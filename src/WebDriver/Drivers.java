package WebDriver;

public enum Drivers {
    CHROME("chrome","Desktop/Chrome.exe"),
    SAFARI("Firefox","Desktop/Firefox.exe"),
    OPERA("Opera","Desktop/Opera.exe");

    String name;
    String path;

    Drivers(String name, String path){
        this.name = name;
        this.path = path;
    }
}


