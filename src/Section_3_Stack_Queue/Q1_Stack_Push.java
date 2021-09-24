package Section_3_Stack_Queue;

public class Q1_Stack_Push {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
//        stack.push(6); => Error: Index 5 out of bounds for length 5
        System.out.println(stack);
    }
}

class MyStack {
    private int[] array;
    private int capacity;
    private int top;

    // Constructor
    public MyStack(){
        // stack size is max 5
        this.array = new int[5];
        this.capacity = 5;
        this.top = -1;
    }

    public void push (int data) {
        // Push method (we do not use API at the moment)
        array[++top] = data;
    }
    @Override
    public String toString() {
        StringBuffer sbuf = new StringBuffer();
        for (int i = capacity - 1; i >= 0; i--) {
            Integer data = (i <= top) ? array[i] : null;
            sbuf.append(String.format("| %4s |%s\n", data, (i == top) ? " <- top " : ""));
        }
        return sbuf.append("--------\n").toString();
    }

}
