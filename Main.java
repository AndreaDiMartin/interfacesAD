import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        MyStackArrayList stack = new MyStackArrayList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(100);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        MyStackArray stackArray = new MyStackArray();
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(100);
        System.out.println(stackArray.peek());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.peek());

    }
}
