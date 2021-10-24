package CommonChallenge;

import java.util.LinkedList;
import java.util.Locale;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("abccba"));
        System.out.println(checkPalindrome("RaceCar"));
    }

    public static boolean checkPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringBuilderNoPunc = new StringBuilder(string.length());

        String lowerCase = string.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringBuilderNoPunc.append(c);
                stack.push(c);
            }
        }

        StringBuilder reverseString = new StringBuilder(stack.size());
        while(!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }

        return stringBuilderNoPunc.toString().equals(reverseString.toString());
    }
}

