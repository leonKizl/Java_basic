package WebDriver;

public class test {

    public static Driver selector(Drivers type){
        if (type == Drivers.SAFARI){
            return new Safari();
        } else if (type == Drivers.CHROME) {
            return new Chrome();
        }else {
            return new Opera();
        }
    }
    public static void main(String[] args) {
        Drivers[] allBrowsers = Drivers.values();

        Driver[] allBrowsersData = new Driver[allBrowsers.length];

        for (int i = 0; i < allBrowsers.length; i++){
            System.out.println("Browser " + allBrowsers[i] + " is created");
            allBrowsersData[i] = test.selector(allBrowsers[i]);
            allBrowsersData[i].discription();
        }
        System.out.println("JUST TO CHECK");

        for (Driver driver:allBrowsersData){
            driver.discription();
        }
        System.out.println("\n\n\n\n");

        for (Drivers qwert:allBrowsers){
            System.out.println(qwert.name);
            System.out.println(qwert.path);
        }




    }
}
