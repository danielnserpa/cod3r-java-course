package arraysandcollections.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class OrganizedCollection {
    public static void main(String[] args) {

        // Gera um Set sem ordenacao
//        Set<String> namesList = new HashSet<>();
        // Gera um Set com ordenacao
        SortedSet<String> namesList = new TreeSet<>();

        namesList.add("Daniel");
        namesList.add("Pedro");
        namesList.add("Ana");
        namesList.add("Roberto");
        namesList.add("Lucia");

        System.out.println(namesList +"\n");

        for (String nomes: namesList) {
            System.out.println(nomes);
        }
        System.out.println(" ");

        Set<Integer> nums = new HashSet<>();

        nums.add(4);
        nums.add(3);
        nums.add(78);
        nums.add(2);
        nums.add(1);

        System.out.println(nums +"\n");

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
