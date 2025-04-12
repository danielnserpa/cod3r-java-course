package leetcode;

import java.util.Arrays;

public class BinarySearchTest {

    public static int BinariSearch (int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            int result = array[mid];

            if (result > target) {
                high = mid - 1;
            } else if (result < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;


    }

    public static void main(String[] args) {

        int[] num = {2, 4, 6, 8, 10, 12, 14};

        System.out.println(BinariSearch(num, 3));
    }
}
