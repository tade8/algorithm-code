package algorithms;

import java.util.Arrays;

public class Stack {
    private final int[] stack;
    private int size;

    public Stack(int size) {
        stack = new int[size];
    }

    public void push(int item) {
        if (stack.length == size) {
            System.out.println(
                    "Cannot add value " + item + ", stack is full");
        }
        else stack[size++] = item;
    }

    public void pop() {
        if (size == 0) {
            System.out.println("No element in stack");
        }
        else --size;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }

    public static void main(String[] args) {
        Stack mystack = new Stack(2);
        mystack.push(7);

        mystack.pop();
        mystack.pop();

        System.out.println(mystack);
    }
}

