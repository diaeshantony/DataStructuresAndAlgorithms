package LinkedListStack;

import ArrayStack.ArrayStack;

public class Main {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(new Employee("Jane", "Jones", 21));
        stack.push(new Employee("John", "Doe", 22));
        stack.push(new Employee("Mary", "Smith", 23));
        stack.push(new Employee("Mike", "Wilson", 24));
        stack.push(new Employee("Thomas", "Copper", 25));

        System.out.println("Print the stack here: ");
        stack.printStack();
    }
}
