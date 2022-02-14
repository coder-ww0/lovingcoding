package leetcode.动态规划.f;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author www
 * @date 2021/12/10 20:15
 * @description: TODO
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        // 外层for循环用于遍历每一层
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            // 内层for循环用于生成每行中的具体的数
            // 如果是第一个或最后一个是1
            // 其他位置是上一层该位置和前一个位置和
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generate(5));
    }
}
