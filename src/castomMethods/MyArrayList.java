package castomMethods;

import java.util.Arrays;

public class MyArrayList {

    int [] array = new int [10];
    private int size;

    public void add(int elem){
        if(size == array.length) {
            int [] newarr = new int [size*3/2 +1];
            System.arraycopy(array,0,newarr,0,size);
            array = newarr;
        }
        array[size] = elem;
        size++;
    }

    public void add(int index, int elem){
        array[index] = elem;
        size++;
    }

    public void remove(int index){
        array[index] = 0;
        size--;
    }

    public void clear(){
        for (int i = 0; i < array.length ; i++){
            array[i] = 0;
            size = 0;
        }
    }

    public int get(int index){
        return array[index];
    }

    public int size(){
        return size;
    }

    public boolean contains (int elem){
        for (int i : array){
            if (i == elem) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
