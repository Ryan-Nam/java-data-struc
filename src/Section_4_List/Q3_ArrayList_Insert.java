package Section_4_List;

public class Q3_ArrayList_Insert {
    public static void main(String[] args) {
        SimpleArrayLists list = new SimpleArrayLists();
        System.out.println(list);
        list.insert(3, 90);
        list.insert(1, 99);
        System.out.println(list);
    }
}
class SimpleArrayLists {
    int[] elements;
    int size;
    public SimpleArrayLists() {
        this.elements = new int[10];
        this.size = 8;
        for (int i = 0; i < size; i++) {
            elements[i] = 100 - 4 * i;
        }
    }
    public void insert(int index, int n) {
        /* 해당 코드를 구현하시오. */
    }
    public String toString() {
        StringBuffer sbuf = new StringBuffer("list = ");
        for (int i = 0; i < size; i++) {
            sbuf.append(elements[i] + " ");
        }
        return sbuf.toString();
    }
}
