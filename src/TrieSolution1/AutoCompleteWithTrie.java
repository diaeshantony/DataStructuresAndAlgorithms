package TrieSolution1;

import java.util.List;

public class AutoCompleteWithTrie {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("amazon");
        t.insert("amazon prime");
        t.insert("amazing");
        t.insert("amazing spider man");
        t.insert("amazed");
        t.insert("ali express");
        t.insert("ebay");
        t.insert("walmart");

        List<String> a = t.autocomplete("a");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
;    }
}
