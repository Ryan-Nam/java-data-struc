package Section_3_Stack_Queue;
//FIFO: First In Frist Out
public class Q4_Queue_Enqueue {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue);
    }
}
class MyQueue {
    private int[] elements;
    private int capacity;
    private int front; // thing to bring out's index
    private int rear; // last added index
    private int size; // size
    public MyQueue() {
        this.elements = new int[5];
        this.capacity = 5;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    public void enqueue(int data) {
        /* method */
        if (isEmpty()) {
            elements[rear] = data;
        } else {
            elements[++rear] = data;
        }
        size++;
    }
    public int front() {
        return elements[front];
    }
    public int rear() {
        return elements[rear];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public String toString() {
        StringBuffer sbuf = new StringBuffer("---------------\n");
        for (int i = 0; i < capacity; i++) {
            if (i >= front && i <= rear && !isEmpty())
                sbuf.append(String.format("%2d ", elements[i]));
            else
                sbuf.append(String.format("%2s ", "ø"));
        }
        sbuf.append("\n---------------\n");
        sbuf.append("[0][1][2][3][4]\n\n");
        sbuf.append(String.format("front: [%d], rear: [%d], isEmpty?: %s", front, rear, isEmpty()));
        return sbuf.toString();
    }
}
