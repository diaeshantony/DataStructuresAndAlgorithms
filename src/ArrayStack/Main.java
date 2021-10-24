package ArrayStack;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(new Employee("Jane", "Jones", 21));
        stack.push(new Employee("John", "Doe", 22));
        stack.push(new Employee("Mary", "Smith", 23));
        stack.push(new Employee("Mike", "Wilson", 24));
        stack.push(new Employee("Thomas", "Copper", 25));

        stack.printStack();

        System.out.println("------Peek-------");
        System.out.println(stack.peek());

        System.out.println("------POP-------");
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());
    }
}
