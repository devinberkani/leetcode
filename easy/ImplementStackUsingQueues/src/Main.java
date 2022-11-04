import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

         MyStack obj = new MyStack();
         obj.push(1);
         obj.push(2);
         int param_2 = obj.top();
         int param_3 = obj.pop();
         boolean param_4 = obj.empty();

        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}

class MyStack {
    private Queue<Integer> queueOne = new LinkedList<>();
    private Queue<Integer> queueTwo = new LinkedList<>();
    public MyStack() {

    }

    public void push(int x) {
        queueOne.add(x);
    }

    public int pop() {
        int size = queueOne.size();
        int current = 0;
        for (int i = 0; i < size; i ++) {
            current = queueOne.remove();
            if (i != size - 1) {
                queueTwo.add(current);
            }
        }
        queueOne = queueTwo;
        return current;
    }

    public int top() {
        queueTwo = queueOne;
        int size = queueOne.size();
        int current = 0;
        for (int i = 0; i < size; i++) {
            current = queueOne.remove();
            queueTwo.add(current);
        }
        queueOne = queueTwo;
        return current;
    }

    public boolean empty() {
        return queueOne.isEmpty();
    }
}