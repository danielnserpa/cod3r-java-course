package leetcode;

import java.util.Arrays;

public class BinarySearchTest {

    public static int BinariSearch (int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            int result = array[mid];
            System.out.println("mid is: " + result);

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

        int[] num = {1, 4, 8, 13 ,21 ,34 ,53 ,62};

        System.out.println(BinariSearch(num, 4));
    }
}
