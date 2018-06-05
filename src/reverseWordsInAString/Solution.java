package reverseWordsInAString;

import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        String answer = "";
        Stack<String> reverseString = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)
        }
//        reverseString.push();
        answer += reverseString.pop();
        return answer;
    }

    public static void main(String[] args) {

    }
}
