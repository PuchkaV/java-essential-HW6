package Task2;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

    ArrayList <String> zoo = new ArrayList<>();

        zoo.add(0, "elephant");
        zoo.add(1, "horse");
        zoo.add(2, "lion");
        zoo.add(3,"egle");
        zoo.add(4, "leopard");
        zoo.add(5,"woolf");
        zoo.add(6, "rabbit");
        zoo.add(7, "snake");

    for(String s: zoo){
            System.out.println(s);
        }

    }

}
