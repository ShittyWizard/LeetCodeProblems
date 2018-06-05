package reverseWordsInAString;

import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder answer = new StringBuilder();
        Stack<String> reverseString = new Stack<>();
        for (String word : s.split(" ")) {
            if (!word.equals(" ") && word.length() != 0) {
                System.out.println("Word is: (" + word + ")");
                reverseString.push(word);
            }
        }
        while (!reverseString.empty()) {
            answer.append(reverseString.pop());
            answer.append(" ");
        }
        System.out.println("answer = " + answer);
        return answer.toString().trim();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "   a   b ";
        solution.reverseWords(s);
    }
}
