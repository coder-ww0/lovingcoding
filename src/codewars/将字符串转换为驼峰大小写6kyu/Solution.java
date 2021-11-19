package codewars.将字符串转换为驼峰大小写6kyu;

import java.util.Arrays;

/**
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */
public class Solution {
    public static String toCamelCase(String s){
//        StringBuilder target = new StringBuilder();
//        String[] res = s.split("[-_]");
//        for (int i = 0; i < res.length; i++) {
//            if (i > 0) {
//                target.append(res[i].substring(0, 1).toUpperCase()).append(res[i].substring(1));
//            } else {
//                target.append(res[i]);
//            }
//        }
//        return target.toString();
        String[] words = s.split("[-_]");
        String result = Arrays.stream(words, 1, words.length).map(p -> p.substring(0, 1).toUpperCase() + p.substring(1))
                .reduce(words[0], String::concat);
        return result;
    }
    public static void main(String[] args) {
        String source = "the-stealth-warrior";
        source = "The_Stealth_Warrior";

        System.out.println(toCamelCase(source));
    }
}
