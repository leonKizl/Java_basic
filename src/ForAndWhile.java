import java.util.Scanner;

public class ForAndWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        for (int i = 0; i <= value; i++){
            if (i%5==0){
                System.out.println(i);
            }
        }
        System.out.println("wile");
        int a = 5;
        while (a<100){
            System.out.println(a);
            a=a+5;
        }

        String[] names = new String[]{"wika","leon","lana","wika_swin","wika_swin_kozel","wrednaja_sestra_wiki"};
        int[] data = new int[]{13,14,15,16};
        for (int i = 2;i < names.length; i++){
            System.out.println(names[i]);
        }
        int j = 0;
        while (j < names.length){
            System.out.println(names[j]);
            j++;
        }

        for (int i = 2; i < data.length;i++){
            System.out.println(data[i]);
        }

        int k = 2;
        while (k < data.length){
            System.out.println(data[k]);
            k++;
        }
    }
}
