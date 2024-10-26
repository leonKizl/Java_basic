public class REVERSE {
    public static void main(String[] args) {
        int[] numbers = new int[] {2,4,6,8,10,14,16,18,20,22};

        System.out.println(numbers.length);
        System.out.println("First method");

        for (int i = numbers.length-1;i >= 0;i--){
            System.out.println(numbers[i]);
        }

        System.out.println("Second method");

        for (int j =0;j < numbers.length/2;j++){
            int temp = numbers[j];
            System.out.println(temp);
            numbers[j] = numbers[numbers.length - 1 - j];
            System.out.println(temp);
            numbers[numbers.length - 1 -j] = temp;
            System.out.println(j);



        }
        for (int j = 0;j < numbers.length;j++){
            System.out.println(numbers[j]);
        }

        System.out.println("New one");

        String[] names = new String[] {"Alena","Maks","Kozel","Nielenia","Niewika"};

        for (int i = names.length-1;i>=0;i--){
            System.out.println(names[i]);
        }

        for (int o = 0;o <= names.length/2;o++){
            String temporar = names[o];
            names[o] = names[names.length - 1 - o];
            names[names.length -1 - o] = temporar;

            System.out.println(o);
        }
        System.out.println("reverse");
        for (int o = 0; o < names.length;o++){
            System.out.println(names[o]);
        }
    }

}
