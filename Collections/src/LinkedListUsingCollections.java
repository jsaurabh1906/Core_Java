import java.util.LinkedList;
import java.util.List;

public class LinkedListUsingCollections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(1);
        list.addFirst(2);
        System.out.println(list);   //[2, 1]

        list.addLast(3);
        list.addLast(4);
        list.add(5);
        System.out.println(list);   //[2, 1, 3, 4, 5]

        System.out.println(list.size()); //5

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) +" ");
        }                                       //2 1 3 4 5

        System.out.println();
        list.removeFirst();
        System.out.println(list);   //[1, 3, 4, 5]

        list.removeLast();
        System.out.println(list);   //[1, 3, 4]

        list.remove();    // removes first element or if index is passed removes at that index
        System.out.println(list);   //[3, 4]

        list.remove(1);  // removes element at index
        System.out.println(list);



    }
}
