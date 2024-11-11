package AI;

public enum Fruits {
    APPLE("Apple","Red"),
    ORANGE("Orange","Orange"),
    BANANA("Banana","Yellow");

    String color;
    String name;

    Fruits(String name, String color){
        this.name = name;
        this.color = color;
    }

}
