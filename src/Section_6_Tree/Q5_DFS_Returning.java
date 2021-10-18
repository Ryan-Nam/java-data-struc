package Section_6_Tree;

public class Q5_DFS_Returning {
    public static void main(String[] args) {
        // 트리 생성 및 구조화
        MyTree tree7 = new MyTree(77, null, null);
        MyTree tree6 = new MyTree(66, null, null);
        MyTree tree5 = new MyTree(55, null, null);
        MyTree tree4 = new MyTree(44, null, null);
        MyTree tree3 = new MyTree(33, tree6, tree7);
        MyTree tree2 = new MyTree(22, tree4, tree5);
        MyTree tree1 = new MyTree(11, tree2, tree3);

        // 순회 출력
        tree1.printBFS(); // 전위
    }
}

class MyTree {
    // 최상위 노드
    private Node root;

    // 생성자
    public MyTree(int data, MyTree leftSubtree, MyTree rightSubtree) {
        // 루트 노드 생성
        this.root = new Node(data, null, null);

        // 서브 트리 연결
        root.leftChild = (leftSubtree == null) ? null : leftSubtree.root;
        root.rightChild = (rightSubtree == null) ? null : rightSubtree.root;
    }

    // 전위 순회
    public void printBFS() {
        System.out.print("BFS 순회: ");
        /* 해당 메소드를 구현하시오. */
        System.out.println();
    }
}

class Node {
    int data; // 데이터
    Node leftChild; // 왼쪽 자식 노드
    Node rightChild; // 오른쪽 자식 노드

    public Node(int data, Node leftChild, Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}