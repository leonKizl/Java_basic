public class ForLoopWhileLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("While");
        int r = 5;
        while (r <= 100){
            if (r%5==0){
                System.out.println(r);
            }
            r++;
        }



        int[] table = new int[] {1,3,5};
        System.out.println(table.length);

        for (int z = 2;z >= (table.length-3);z--){
            System.out.println(table[z]);
        }
        System.out.println("wg");
        int k = table.length-1;
        while (k >=0){
            System.out.println(table[k]);
            k--;
        }
        }
    }
