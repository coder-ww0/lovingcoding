package leetcode.动态规划.斐波那契数列;

/**
 * @author www
 * @date 2021/12/10 20:08
 * @description: 斐波那契数列  0 1 1 2 3
 */
class Solution {
    public int fib(int n) {
        if (n < 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fib(7));
    }
}
