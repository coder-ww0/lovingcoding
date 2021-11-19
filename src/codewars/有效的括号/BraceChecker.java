package codewars.有效的括号;

import javax.swing.text.AbstractDocument;
import java.util.Stack;

/**
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 */
public class BraceChecker {
    // 用stack进行解决
//    public boolean isValid(String braces) {
//        Stack<Character> stack = new Stack<>();
//        for (char item : braces.toCharArray()) {
//            if (item == '{' || item == '(' || item == '[') {
//                stack.push(item);
//            } else {
//                // 查看栈顶的元素是否与之一致
//                char top = stack.pop();
//                if (item == '}' && top != '{') {
//                    return false;
//                }
//                if (item == ']' && top != '[') {
//                    return false;
//                }
//                if (item == ')' && top != '(') {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
    // 字符串替换
    public boolean isValid(String braces) {
        String b = braces;
        System.out.println(braces);
        for(int i=0;i<braces.length()/2;i++) {
            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");
            System.out.println(b);
            if(b.length() == 0)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker();
        String test = "(){}[]";
//        test = "[({})](]";
        System.out.println(braceChecker.isValid(test));
    }

}
