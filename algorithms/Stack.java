package algorithms;

public class Stack {
    private final int[] stack;
    private int element;
    public Stack(int size) {
        stack = new int[size];
    }

    public void push(int item) {
        if (element == stack.length-1)
            System.out.println("Stack is full");
        else stack[++element] = item;
    }

    public int pop() {
        if (element < 0) {
            System.out.println("No element in stack");
            return 0;
        }
        else
            return stack[element--];
    }

    public static void main(String[] args) {
        Stack mystack = new Stack(5);
        mystack.push(7);
        System.out.println(mystack.pop());
        System.out.println(mystack);
    }
}
