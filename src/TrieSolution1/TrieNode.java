package TrieSolution1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TrieNode {
    char data;
    LinkedList<TrieNode> children;
    TrieNode parent;
    boolean isEnd;

    public TrieNode(char c) {
        this.data = c;
        children = new LinkedList<TrieNode>();
        isEnd = false;
    }

    public TrieNode getChild(char c) {
        if(children != null) {
            for (TrieNode eachChild : children) {
                if(eachChild.data == c) {
                    return eachChild;
                }
            }
        }
        return null;
    }

    public List<String> getWords() {
        List<String> list = new ArrayList<>();
        if(isEnd) {
            list.add(toString());
        }

        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                if(children.get(i) != null) {
                    list.addAll(children.get(i).getWords());
                }
            }
        }
        return list;
    }

    public String toString() {
        if(parent == null) {
            return "";
        } else {
            return parent.toString() + new String(new char[] {data});
        }
    }
}
