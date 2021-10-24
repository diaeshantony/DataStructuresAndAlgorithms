package JDKLinkedList;

import LinkedList.EmployeeLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    private static LinkedList<Employee> list;
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 21);
        Employee johnDoe = new Employee("John", "Doe", 22);
        Employee marySmith = new Employee("Mary", "Smith", 23);
        Employee mikeWilson = new Employee("Mike", "Wilson", 24);

        Employee billEnd = new Employee("Bill", "End", 24);

        list = new LinkedList<>();
        //Add to the front
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        printList();

        //Add to the end
        list.add(billEnd);
        printList();

        //Remove First
        list.removeFirst();
        printList();

        //Remove from last
        list.removeLast();
        printList();
    }

    public static void printList() {
        Iterator iter = list.iterator();
        System.out.print("HEAD->");
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");
    }
}
