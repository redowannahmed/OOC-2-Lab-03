package Task2;

import java.util.Stack;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Node {
    private int data;
    private Node next;

    public Node(int n) {
        this.data = n;
        this.next = null;
    }
}

class MaxStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int item) {
        mainStack.push(item);

        if (maxStack.isEmpty() || item >= maxStack.peek()) {
            maxStack.push(item);
        }
    }

    public void pop() {
        if (mainStack.isEmpty()) {
            return;
        }

        if (mainStack.peek().equals(maxStack.peek())) {
            maxStack.pop();
        }

        mainStack.pop();
    }

    public int max() {
        if (maxStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return maxStack.peek();
    }

    public int top() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return mainStack.peek();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
}
