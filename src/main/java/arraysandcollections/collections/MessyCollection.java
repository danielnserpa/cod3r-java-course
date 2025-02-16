package arraysandcollections.collections;

import java.util.HashSet;
import java.util.Set;

public class MessyCollection {
    public static void main(String[] args) {
        HashSet collection = new HashSet();

        collection.add(1);
        collection.add(true);
        collection.add('x');
        collection.add("Daniel");
        collection.add(7.5);

        System.out.println(collection.size());
        System.out.println(collection);
        collection.remove('x');
        System.out.println(collection.size());
        System.out.println(collection);
        System.out.println(collection.contains(1));

        Set nums = new HashSet();

        nums.add(1);
        nums.add("Roberto");
        nums.add(3);

        System.out.println(nums);

        collection.addAll(nums);
        System.out.println(collection);

        collection.retainAll(nums);
        System.out.println(collection);

        collection.clear();
        System.out.println(collection);

    }



}
