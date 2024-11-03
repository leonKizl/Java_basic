public class metody {

    public static void main(String[] args) {
        AndroidApp vectra = new AndroidApp("vectra");
        vectra.appInfo();
        vectra.runAndro();

        IphoneApp vectr = new IphoneApp("vectra");
        vectr.appInfo();
        vectr.runIos();
    }
}
