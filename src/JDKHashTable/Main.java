package JDKHashTable;

import ChainedHashTable.ChainedHashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       Employee janeJones = new Employee("Jane", "Jones", 22);
       Employee johnDoe = new Employee("John", "Doe", 23);
       Employee marySmith = new Employee("Mary", "Smith", 24);
       Employee mikeWilson = new Employee("Mike", "Wilson", 25);

       Map<String, Employee> hashMap = new HashMap<String, Employee>();
       hashMap.put("Jones", janeJones);
       hashMap.put("Doe", johnDoe);
       hashMap.put("Smith", marySmith);
       hashMap.put("Wilson", mikeWilson);

       System.out.println(hashMap.containsKey("Doe"));
       System.out.println(hashMap.containsValue(janeJones));

       Iterator<Employee> iterator = hashMap.values().iterator();
       while (iterator.hasNext()) {
          System.out.println(iterator.next());
       }

       System.out.println("Other method of printing...");
       hashMap.remove("Wilson");
       hashMap.forEach((k,v) -> System.out.println("Key= " + k + ", Employee=" + v));
    }
}
