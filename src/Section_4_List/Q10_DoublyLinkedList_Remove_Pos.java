package Section_4_List;

public class Q10_DoublyLinkedList_Remove_Pos {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(11);
        list.addFirst(22);
        list.addFirst(33);
        list.add(1, 44);
        list.remove(2);
        System.out.println(list.toString());
        System.out.println(list.toStringBackward());
    }
}
class DoublyLinkedList {
    private Node head;
    private Node tail;
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void remove(int pos) {
        /* 해당 메소드를 구현하시오. */
    }
    public void add(int pos, int data) {
        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.right;
        }
        Node next = prev.right;
        Node newest = new Node(data, prev, next);
        prev.right = newest;
        next.left = newest;
    }
    public void addFirst(int data) {
        Node newNode = new Node(data, null, head);
        if (tail == null)
            tail = newNode;
        else
            head.left = newNode;
        head = newNode;
    }
    public String toString() {
        StringBuffer sbuf = new StringBuffer("list: head -> ");
        Node temp = head;
        while (temp != null) {
            sbuf.append(temp.data + " -> ");
            temp = temp.right;
        }
        return sbuf.append("null").toString();
    }
    public String toStringBackward() {
        StringBuffer sbuf = new StringBuffer("list: tail -> ");
        Node temp = tail;
        while (temp != null) {
            sbuf.append(temp.data + " -> ");
            temp = temp.left;
        }
        return sbuf.append("null").toString();
    }
    class Node {
        int data;
        Node left;
        Node right;
        private Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
