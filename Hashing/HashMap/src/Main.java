import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // HashMap : key- value pairs
        // unique keys
        // values can be duplicated
        // order not preserved

        HashMap<String, Integer > hmap = new HashMap<>();
        // Insertion
        hmap.put("India", 130);
        hmap.put("USA",30);
        hmap.put("China",145);

        //print
        System.out.println(hmap);

        //update
        hmap.put("China", 155); // here the value will be updated
        System.out.println(hmap); // no new record added as duplicate keys not allowed

        //search key
        if(hmap.containsKey("India")){
            System.out.println("Yupp!! the key is present");
        }
        else {
            System.out.println("Sorry! the key is not present");
        }

         // search value or get value from key
            // key exists
        System.out.println(hmap.get("India"));  // op: 130
            // key does not exists
        System.out.println(hmap.get("Indonesia")); // op: null

        // traversal over map or Iteration
                // using entryset
        for(Map.Entry<String, Integer> entry : hmap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("____________________________________________");

                // using set keyset
        Set<String> keys = hmap.keySet();
        for(String key : keys){
            System.out.println(key + " "+ hmap.get(key));
        }

        //delete
            // deleting key also deletes its corresponding values
        hmap.remove("China");
        System.out.println(hmap);

    }
}