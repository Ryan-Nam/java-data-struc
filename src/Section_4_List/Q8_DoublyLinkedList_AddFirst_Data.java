package Section_4_List;

public class Q8_DoublyLinkedList_AddFirst_Data {


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(11);
        list.addFirst(22);
        list.addFirst(33);
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
    public void addFirst(int data) {
        /* 해당 메소드를 구현하시오. */
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
