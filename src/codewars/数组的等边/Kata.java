package codewars.数组的等边;

import java.util.ArrayList;
import java.util.Collections;

/**
 * {1,100,50,-51,1,1} 返回1，在索引1的左右两边相等
 */
public class Kata {
    public static int findEvenIndex(int[] arr) {
        // 求数组的和
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == sum - arr[i]) {
                return i;
            } else {
                leftSum += arr[i];
                sum -= arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {1,100,50,-51,1,1};
        System.out.println(findEvenIndex(test));

    }
}
