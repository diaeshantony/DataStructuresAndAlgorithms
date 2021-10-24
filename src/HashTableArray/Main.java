package HashTableArray;

import Queue.ArrayQueue;

public class Main {
    public static void main(String[] args) {
       Employee janeJones = new Employee("Jane", "Jones", 22);
       Employee johnDoe = new Employee("John", "Doe", 23);
       Employee marySmith = new Employee("Mary", "Smith", 24);
       Employee mikeWilson = new Employee("Mike", "Wilson", 25);
       Employee billEnd = new Employee("Bill", "End", 26);

       SimpleHashTable simpleHT = new SimpleHashTable();
       simpleHT.put("Jones",janeJones);
       simpleHT.put("Doe", johnDoe);
       simpleHT.put("Wilson", mikeWilson);
       simpleHT.put("Smith", marySmith);

       simpleHT.printHashTable();
       System.out.println("Retrive key wilson " + simpleHT.get("Wilson"));

       System.out.println("Lets remove some items from hashtable");
       simpleHT.remove("Wilson");
       simpleHT.remove("Jones");
       simpleHT.printHashTable();
    }
}
