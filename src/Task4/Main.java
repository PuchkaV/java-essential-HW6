package Task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(new Integer(2));


        ListIterator <Integer> iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next()+1);
        }
    }
}
