package leetcode.剑指offer.连续子数组的最大和42;

import java.util.Arrays;

/**
 * @author www
 * @date 2021/11/24
 * @description
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 *
 * 示例1:
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 */
public class Soluction {

    public int maxSubArray(int[] nums) {
        /*
            解题思路，采用动态规划
            dp[i] = dp[i-1] + nums[i]
                    nums[i]    (当dp[i-1] < 0)
         */
        int[] dp = new int[nums.length];
        int res = nums[0];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }
            res = Math.max(dp[i], res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new Soluction().maxSubArray(nums));
    }
}
