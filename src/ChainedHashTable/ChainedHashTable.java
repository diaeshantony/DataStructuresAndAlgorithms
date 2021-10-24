package ChainedHashTable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable() {
        this.hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    private int hashKey(String key) {
        return Math.abs(key.length() % hashtable.length);
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> listIterator =
                hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while(listIterator.hasNext()) {
            storedEmployee = listIterator.next();
            if(storedEmployee.key.equals(key)) {
                return storedEmployee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> listIterator =
                hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while(listIterator.hasNext()) {
            storedEmployee = listIterator.next();
            if(storedEmployee.key.equals(key)) {
               break;
            }
        }

        if(storedEmployee == null) {
            return null;
        } else {
            hashtable[hashedKey].remove(storedEmployee);
            return storedEmployee.employee;
        }
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ":empty");
            } else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> listIterator = hashtable[i].listIterator();
                while(listIterator.hasNext()) {
                    System.out.print(listIterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }


    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }


}
