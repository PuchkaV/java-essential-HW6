package castomMethods;



public class Main {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.add(8,20);
        System.out.println(list);
        System.out.println(list.contains(5));
        System.out.println(list.get(3));
        System.out.println(list.size());
        list.remove(5);
        System.out.println(list);
        list.clear();
        System.out.println(list);


    }
}
