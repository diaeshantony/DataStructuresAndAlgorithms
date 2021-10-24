package CircullarQueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.Enqueue(new Employee("Jane", "Jones", 21));
        queue.Enqueue(new Employee("John", "Doe", 22));
        queue.Dequeue();
        queue.Enqueue(new Employee("Mary", "Smith", 23));
        queue.Dequeue();
        queue.Enqueue(new Employee("Mike", "Wilson", 24));
        queue.Dequeue();
        queue.Enqueue(new Employee("Thomas", "Copper", 25));
        queue.Dequeue();
        queue.Enqueue(new Employee("Thomas", "Copper", 25));
        queue.Dequeue();
        queue.Enqueue(new Employee("Thomas", "Copper", 25));
        queue.Dequeue();

        System.out.println("Print the queue here: ");
        queue.printQueue();

        System.out.println(queue.peek());
    }
}
