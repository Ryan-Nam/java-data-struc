package Section_4_List;

public class Q4_ArrayList_Remove {
    public static void main(String[] args) {
        SimpleArrayListt list = new SimpleArrayListt();
        System.out.println(list);
        list.remove(4);
        list.remove(2);
        System.out.println(list);
    }
}

class SimpleArrayListt {
    int[] elements;
    int size;

    public SimpleArrayListt() {
        this.elements = new int[10];
        this.size = 8;
        for (int i = 0; i < size; i++) {
            elements[i] = 100 - 4 * i;
        }
    }

    public void remove(int index) {

    }

    public String toString() {
        StringBuffer sbuf = new StringBuffer("list = ");
        for (int i = 0; i < size; i++) {
            sbuf.append(elements[i] + " ");
        }
        return sbuf.toString();
    }
}

