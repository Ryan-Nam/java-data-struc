package Section_3_Stack_Queue;

public class Q7_Curcular_Queue {
    public static void main(String[] args) {
        MyQueuee queue = new MyQueuee();
        int data = 1;
        while (!queue.isFull()) {
            queue.enqueue(data++);
        }
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(data++);
        System.out.println(queue);
    }
}
class MyQueuee {
    private int[] elements;
    private int capacity;
    private int front;
    private int rear;
    private int size;
    public MyQueuee() {
        this.elements = new int[5];
        this.capacity = 5;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    public int dequeue() {

    }
    public void enqueue(int data) {

    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    @Override
    public String toString() {
        StringBuffer sbuf = new StringBuffer("---------------\n");
        for (int i = 0; i < capacity; i++) {
            if (!isEmpty() && (front <= rear && i >= front && i <= rear) || (front > rear && (i >= front || i <= rear)))
                sbuf.append(String.format("%2d ", elements[i]));
            else
                sbuf.append(String.format("%2s ", "ø"));
        }
        sbuf.append("\n---------------\n");
        sbuf.append("[0][1][2][3][4]\n\n");
        sbuf.append(String.format("front: [%d], rear: [%d], isEmpty?: %s, isFull?: %s", front, rear, isEmpty(), isFull()));
        return sbuf.toString();
    }
}