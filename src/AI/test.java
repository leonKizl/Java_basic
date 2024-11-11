package AI;

public class test {
    public static void getInfo(Fruits item){
        System.out.println("Fruit name: " + item.name + ", color: " + item.color);

    }

    public static void main(String[] args) {
        Fruits [] allFruits = Fruits.values();
        System.out.println(allFruits[1].color);;


        for (Fruits fruit:allFruits){
            test.getInfo(fruit);

        }
    }
}
