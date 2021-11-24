package leetcode.剑指offer.剑指offer119_最长连续序列;

import java.util.Arrays;

/**
 * @author www
 * @date 2021/11/24
 * @description 最长连续子序列
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 示例 2：
 * <p>
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 */
public class Soluction {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 先将数组进行排序
        Arrays.sort(nums);
        // 记录最长连续序列
        int res = 1;
        // 记录当前的最大的连续序列
        int count = 1;
        // 比较数组中的值，如果临近的值相等，向后移，==1 最大值加一，否则记录1，然后重新进行最大值的计算
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                count++;
            } else if (nums[i + 1] - nums[i] > 1) {
                // 后面的数字非连续，此时进行重新计数
                count = 1;
            }
            res = Math.max(res, count);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println(new Soluction().longestConsecutive(nums));
    }
}
