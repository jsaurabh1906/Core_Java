import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add Elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);       //[10, 20, 30]

        //Get Elements using index
        int element = list.get(0);
        System.out.println(element);    // 10

        //Add At specific position
        list.add(2,40);
        System.out.println(list);       //[10, 20, 40, 30]

        //set or update element
        list.set(2,50);
        System.out.println(list);       //[10, 20, 50, 30]

        //remove element
        list.remove(2);
        System.out.println(list);       //[10, 20, 30]

        //size of list
        int size = list.size();
        System.out.println(size);       //3

        //traverse Arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");        //10 20 30
        }
        System.out.println();
        //////   OR  ///////
        for (int num : list) {
            System.out.print(num + " ");                //10 20 30
        }
        System.out.println();
        //sorting
        Collections.sort(list);  //sorts in asc order
        System.out.println(list);
    }
}
