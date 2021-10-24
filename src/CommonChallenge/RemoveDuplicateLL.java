package CommonChallenge;

import HashTableArray.SimpleHashTable;

import java.util.*;

public class RemoveDuplicateLL {
    public static void main(String[] args) {

       LinkedList<Employee> employees = new LinkedList<Employee>();
       employees.add(new Employee("Jane", "Jones", 22));
       employees.add(new Employee("John", "Doe", 23));
       employees.add(new Employee("Jane", "Jones", 22));
       employees.add(new Employee("Mary", "Smith", 24));
       employees.add(new Employee("Mike", "Wilson", 25));
       employees.add(new Employee("Mary", "Smith", 24));

       employees.forEach(e -> System.out.println(e));

       HashMap<Integer, Employee> hashMap = new HashMap<>();
       ListIterator<Employee> listIterator = employees.listIterator();
       List<Employee> remove = new ArrayList<>();
       while (listIterator.hasNext()) {
          Employee employee = listIterator.next();
          if(hashMap.containsKey(employee.getId())) {
             remove.add(employee);
          } else {
             hashMap.put(employee.getId(), employee);
          }
       }

       for(Employee employee : remove) {
          employees.remove(employee);
       }

       System.out.println("---------------Removed Duplicates----------------------");
       employees.forEach(e -> System.out.println(e));
    }
}
