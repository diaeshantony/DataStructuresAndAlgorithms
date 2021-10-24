package ChainedHashTable;

public class Main {
    public static void main(String[] args) {
       Employee janeJones = new Employee("Jane", "Jones", 22);
       Employee johnDoe = new Employee("John", "Doe", 23);
       Employee marySmith = new Employee("Mary", "Smith", 24);
       Employee mikeWilson = new Employee("Mike", "Wilson", 25);

       ChainedHashTable chainedHT = new ChainedHashTable();
       chainedHT.put("Jones",janeJones);
       chainedHT.put("Doe", johnDoe);
       chainedHT.put("Wilson", mikeWilson);
       chainedHT.put("Smith", marySmith);

       chainedHT.printHashTable();
       System.out.println("Retrive key wilson " + chainedHT.get("Wilson"));

       System.out.println("Lets remove some items from hashtable");
       chainedHT.remove("Wilson");
       chainedHT.remove("Jones");
       chainedHT.printHashTable();
    }
}
