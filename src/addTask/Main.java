package addTask;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

       Teacher teacher1 = new Teacher("Sergiy", "Doroshenko");
       Teacher teacher2 = new Teacher("Olga", "Skiba");
       Teacher teacher3 = new Teacher("Nadia", "Hitrik");
       Teacher teacher4 = new Teacher("Ivan", "Neroznak");

        ArrayList <Teacher> teachers = new ArrayList<>();

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        int beastteacher = teachers.indexOf(teacher1);
        int worstteacher = teachers.indexOf(teacher4);

        System.out.println(beastteacher);
        System.out.println(worstteacher);

        for(Teacher teacher: teachers){
            System.out.println(teacher.getLast() + " " +teacher.getName());
        }

    }
}
