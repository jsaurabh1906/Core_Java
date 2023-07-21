import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Hashset does not adds duplicates
        //Add  O(1)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);


        //Size
        System.out.println("size of set is : " + set.size());


        //Search  O(1)
        if(set.contains(1)) {
            System.out.println("1 is present");
        }


        if(!set.contains(6)) {
            System.out.println("6 is absent");
        }


        //Delete O(1)
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("absent as 1 is now deleted");
        }


        //Print all elements
        System.out.println(set);


        //Iteration - HashSet does not have an order :
        // insertion order not maintained
        set.add(0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();


        //isEmpty
        if(!set.isEmpty()) {
            System.out.println("set is not empty");
        }

    }
}