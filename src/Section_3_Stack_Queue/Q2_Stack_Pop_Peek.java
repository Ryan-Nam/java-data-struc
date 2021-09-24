package Section_3_Stack_Queue;

public class Q2_Stack_Pop_Peek {
    public static void main(String[] args) {
        MyStackk stack = new MyStackk();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        int removed = stack.pop();
        int topData = stack.peek();
        System.out.printf("pop: %d\n", removed);
        System.out.printf("peek: %d\n", topData);
        System.out.println(stack);
    }
}
class MyStackk {
    private int[] array;
    private int capacity;
    private int top;
    public MyStackk() {
        this.array = new int[5];
        this.capacity = 5;
        this.top = -1;
    }
    public int pop() {
        return array[top--];
    }
    public int peek() {
        return array[top];
    }
    public void push(int data) {
        array[++top] = data;
    }
    @Override
    public String toString() {
        StringBuffer sbuf = new StringBuffer("\n");
        for (int i = capacity - 1; i >= 0; i--) {
            Integer data = (i <= top) ? array[i] : null;
            sbuf.append(String.format("| %4s |%s\n", data, (i == top) ? " <- top " : ""));
        }
        return sbuf.append("--------\n").toString();
    }
}