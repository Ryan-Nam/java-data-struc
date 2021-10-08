package Section_4_List;

public class Q7_LinkedList_Remove_Position {
    public static void main (String[] args) {
        SimpleLinkedListImple3 list = new SimpleLinkedListImple3();
        list.addFirst(11);
        list.addFirst(22);
        list.addFirst(33);
        list.add(2, 44);
        System.out.printf("removed: %d\n", list.remove(1));
        System.out.println(list); // List { 33 22 44 11 }
    }
}
class SimpleLinkedListImple3 {
    private Node head;
    public SimpleLinkedListImple3() {
        this.head = null;
    }
    public void addFirst(int data) {
        head = new Node(data, head);
    }
    public void add(int position, int data) {
        Node prev = head;
        for (int i = 0; i < position - 1; i++) {
            prev = prev.next;
        }
        // prev == head 인경우 에러!
        prev.next = new Node(data, prev.next);
    }
    public int remove(int position) {
        /* 해당 메소드를 구현하시오. */
        return -1;
    }
    public String toString() {
        StringBuffer sbuf = new StringBuffer("List { ");
        Node current = head;
        while (current != null) {
            sbuf.append(current.data + " ");
            current = current.next;
        }
        return sbuf.append("}").toString();
    }
}
class Node3 {
    int data;
    Node3 next;
    Node3(int data, Node3 next) {
        this.data = data;
        this.next = next;
    }
}