package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 21);
        Employee johnDoe = new Employee("John", "Doe", 22);
        Employee marySmith = new Employee("Mary", "Smith", 23);
        Employee mikeWilson = new Employee("Mike", "Wilson", 24);
        Employee patrickWilson = new Employee("Patrick", "Wilson", 25);
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.isEmpty();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.getSize();
        list.printList();

        System.out.println("Add patrick before mike");
        list.addBefore(patrickWilson, mikeWilson);
        list.printList();
        System.out.println("----------------------");

        Employee billEnd = new Employee("Bill" , "End", 89);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());

        list.removeNodeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());
    }
}
