import java.util.Stack;

public class Main {
    public static void main(String[] args) {
         MyQueue obj = new MyQueue();
         obj.push(1);
         obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.empty());

    }
}

class MyQueue {
    Stack<Integer> stackMain = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        stackMain.push(x);
    }

    public int pop() {
        Stack<Integer> stackHelper = new Stack<>();
        int result = 0;
        while(stackMain.size() > 1) {
            stackHelper.push(stackMain.pop());
        }
        result = stackMain.pop();
        while(!stackHelper.empty()) {
            stackMain.push(stackHelper.pop());
        }
        return result;
    }

    public int peek() {
        Stack<Integer> stackHelper = new Stack<>();
        int result = 0;
        while(!stackMain.empty()) {
            result = stackHelper.push(stackMain.pop());
        }
        while(!stackHelper.empty()) {
            stackMain.push(stackHelper.pop());
        }
        return result;
    }

    public boolean empty() {
        return stackMain.empty();
    }
}