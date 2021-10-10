package Section_4_List;

public class Q9_DoublyLinkedList_AddFirst_Pos_Data {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(11);
        list.addFirst(22);
        list.addFirst(33);
        list.add(1, 44); // 1번 위치에 새로운 노드를 추가(0부터 시작함을 주의)
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
    public void add(int pos, int data) {
        /* 해당 메소드를 구현하시오. */
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