package codewars.最大公共子序列;

import java.util.Arrays;

/**
 * @author www
 * @date 2021/12/10 19:24
 * @description:
 * 译文：
 * 编写一个名为LCS的函数，它接受两个序列并返回所传递序列的最长公共子序列。
 * 子序列
 * 子序列不同于子字符串。子序列的项不必是原始序列的连续项。
 * 示例子序列
 * 子序列的“abc”=“a”、“b”,“c”,“ab”、“交流”、“公元前”和“abc”。
 *
 * 测试用例
 * Solution.lcs("abcdef", "abc") => returns "abc"
 * Solution.lcs("abcdef", "acf") => returns "acf"
 * Solution.lcs("132535365", "123456789") => returns "12356"
 */


public class Solution {
    public static String lcs(String x, String y) {
        /**
         * 解题思路,采用动态规划
         * if word[i] == word[j]   cell[i][j] = cell[i-1][j-1] + 1
         * if word[i] != word[j]   cell[i][j] = max(cell[i-1][j], cell[i][j-1])  即该数字的上面或者左边
          */
        int[][] cell = new int[x.length()][y.length()];
        int row = 0;
        int col = 0;
        for (int i = 0; i < x.length(); i++) {
            // 先进行最做左边一行的赋值
            if (x.charAt(i) == y.charAt(0)) {
                row++;
            }
            cell[i][0] = row;
        }
        for (int j = 0; j < y.length(); j++) {
            if (y.charAt(j) == x.charAt(0)) {
                col++;
            }
            cell[0][j] = col;
        }
        // 再进行二维数组的构建
        for (int i = 1; i < x.length(); i++){
            for (int j = 1; j < y.length(); j++) {
                if (x.charAt(i) == y.charAt(j)) {
                    cell[i][j] = cell[i-1][j-1] + 1;
                } else {
                    cell[i][j] = Math.max(cell[i-1][j], cell[i][j-1]);
                }
            }
        }
        System.out.println(Arrays.deepToString(cell));
        return Arrays.toString(cell);
    }

    public static void main(String[] args) {
        String test = "abcdef";
        String test2 = "abc";
        System.out.println(lcs(test, test2));
    }
}
