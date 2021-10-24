import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TrieDS {
    private Node root;

    TrieDS() {
        this.root = new Node();
    }

    public void add(final String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(node.children[c] == null) {
                node.children[c] = new Node();
            }
            node = node.children[c];
        }
        node.isWord = true;
    }

    public void addAll(final String... words) {
        for (final String word : words) {
            add(word);
        }
    }

    public List<String> search(final String pattern) {
        final List<String> result = new ArrayList<>();
        final List<Character> prefix = new ArrayList<>();
        searchHelper(root, pattern, 0, prefix, result);
        return result;
    }

    private void searchHelper(final Node node, final String pattern, final int pos,
                              final List<Character> prefix, final List<String> result) {
        if (node == null) {
            return;
        }

        if(pos >= pattern.length()) {
            if(node.isWord) {
                final StringBuilder sb = new StringBuilder();
                for (final char c : prefix) {
                    sb.append(c);
                }
                result.add(sb.toString());
            }
            return;
        }

        final char charAtPos = pattern.charAt(pos);
        if(charAtPos == '.') {
            for (char c  = 'a'; c <= 'z'; c++) {
                prefix.add(c);
                searchHelper(node.children[charAtPos], pattern, pos +1, prefix, result);
                prefix.remove(prefix.size() - 1);
            }
        } else {
            prefix.add(charAtPos);
            searchHelper(node.children[charAtPos], pattern, pos +1, prefix, result);
            prefix.remove(prefix.size() - 1);
        }
    }

    public static class Node {
        public boolean isWord;
        public Node[] children;

        Node() {
            this.isWord = false;
            children = new Node[128];
        }
    }
}
