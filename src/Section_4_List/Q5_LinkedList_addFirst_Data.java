package Section_4_List;

public class Q5_LinkedList_addFirst_Data {
    public static void main (String[] args) {
        SimpleLinkedListImpl list = new SimpleLinkedListImpl();
        System.out.println(list); // List { }
        list.addFirst(11);
        list.addFirst(22);
        list.addFirst(33);
        System.out.println(list); // List { 33 22 11 }
    }
}
class SimpleLinkedListImpl {
    private Node head;
    public SimpleLinkedListImpl() {
        this.head = null;
    }
    public void addFirst(int data) {
        /* 해당 메소드를 구현하시오. */
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
class Node {
    int data;
    Node next;
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
