package Section_6_Tree;

public class Q3_DFS_Middle {
    public static void main(String[] args) {
        // 트리 생성 및 구조화
        MyTree3 tree7 = new MyTree3(77, null, null);
        MyTree3 tree6 = new MyTree3(66, null, null);
        MyTree3 tree5 = new MyTree3(55, null, null);
        MyTree3 tree4 = new MyTree3(44, null, null);
        MyTree3 tree3 = new MyTree3(33, tree6, tree7);
        MyTree3 tree2 = new MyTree3(22, tree4, tree5);
        MyTree3 tree1 = new MyTree3(11, tree2, tree3);

        // 중위 순회 출력
        tree1.printInorder();
    }
}

class MyTree3 {
    // 최상위 노드
    private Node root;

    // 생성자
    public MyTree3(int data, MyTree3 leftSubtree, MyTree3 rightSubtree) {
        // 루트 노드 생성
        this.root = new Node(data, null, null);

        // 서브 트리 연결
        root.leftChild = (leftSubtree == null) ? null : leftSubtree.root;
        root.rightChild = (rightSubtree == null) ? null : rightSubtree.root;
    }

    // 중위 순회
    public void printInorder() {
        System.out.print("inorder: ");
        _inorder(root); // 재귀 호출
        System.out.println();
    }

    private void _inorder(Node parent) {
        /* 재귀적 중위 순회를 구현하시오. */
    }
}

class Node3 {
    int data; // 데이터
    Node3 leftChild; // 왼쪽 자식 노드
    Node3 rightChild; // 오른쪽 자식 노드

    public Node3(int data, Node3 leftChild, Node3 rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}