package Easy;

import java.util.Stack;

public class Implement_Queue_Using_Stack {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
    }

    public static class MyQueue {
        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            if (stack1.isEmpty()) {
                stack1.push(x);
                return;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
        }

        public int pop() {
            return stack1.pop();
        }

        public int peek() {
            return stack1.peek();
        }

        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }

}
