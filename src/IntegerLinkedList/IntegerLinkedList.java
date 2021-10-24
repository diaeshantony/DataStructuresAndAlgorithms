package IntegerLinkedList;

public class IntegerLinkedList {
    private IntegerNode head;
    private int size;

    public void addToFront(Integer val) {
        IntegerNode node = new IntegerNode(val);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public IntegerNode removeNodeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public void insertSorted(Integer value) {
        if (head == null || head.getValue() >= value) {
            addToFront(value);
            return;
        }

        //Find the insertion point
        IntegerNode current = head.getNext();
        IntegerNode previous = head;

        while (current != null && current.getValue() < value) {
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);

        size++;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD->");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
