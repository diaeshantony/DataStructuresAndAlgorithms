package CommonChallenge;

import java.util.LinkedList;

public class PalindromeCheckQueue {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("abccba"));
        System.out.println(checkPalindrome("Malayalam"));
        System.out.println(checkPalindrome("RaceCar"));
    }

    /*
    * Here palindrome check is implemented using stack and queue
    * while popping the elements from the stack, compare it with the
    * elements dequeued from the queue, if they are not same will return
    * false
    * */
    public static boolean checkPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();

        String toLower = string.toLowerCase();
        for (int i = 0; i < toLower.length(); i++) {
            char c = toLower.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stack.push(c);
                queue.addLast(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }
}
