package LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 21);
        Employee johnDoe = new Employee("John", "Doe", 22);
        Employee marySmith = new Employee("Mary", "Smith", 23);
        Employee mikeWilson = new Employee("Mike", "Wilson", 24);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.isEmpty();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.getSize();
        list.printList();

        list.removeNodeFromFront();
        list.printList();
    }
}
