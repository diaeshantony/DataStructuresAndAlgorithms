import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class TrieDSTest {
    @Test
    public void testTrieDS() {
        TrieDS trie = new TrieDS();
        trie.addAll("cat","dog", "cog", "java");
        List<String> lists = new ArrayList<>();
        lists = trie.search(".og");

        Iterator iter = lists.listIterator();
        while(iter.hasNext()){
            System.out.println("Item is :" + iter.next());
        }
        assertNotNull(lists);
    }
}
