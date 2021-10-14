package Section_6_Tree;

public class Q1_Binary_Tree {
    public static void main(String[] args) {
        // 트리 생성
        MyTree tree1 = new MyTree(11, null, null);
        MyTree tree2 = new MyTree(22, null, null);
        MyTree tree3 = new MyTree(33, null, null);
        MyTree tree4 = new MyTree(44, null, null);
        MyTree tree5 = new MyTree(55, null, null);
        MyTree tree6 = new MyTree(66, null, null);
        MyTree tree7 = new MyTree(77, null, null);

        // 트리 조합
        tree1.setLeftSubtree(tree2);
        tree1.setRightSubtree(tree3);

        /* 나머지 트리를 조합하여 트리를 완성하시오. */

        // 트리 순회
        tree1.printPreorder();
    }
}

class MyTree {
    // 최상위 노드
    private TreeNode root;

    // 생성자
    public MyTree(int data, MyTree leftSubtree, MyTree rightSubtree) {
        // 루트 노드 생성
        this.root = new TreeNode(data, null, null);

        // 서브 트리 연결
        root.leftChild = (leftSubtree == null) ? null : leftSubtree.root;
        root.rightChild = (rightSubtree == null) ? null : rightSubtree.root;
    }

    public void setLeftSubtree(MyTree subtree) {
        root.leftChild = subtree.root;
    }

    public void setRightSubtree(MyTree subtree) {
        root.rightChild = subtree.root;
    }

    // 전위 순회
    public void printPreorder() {
        System.out.print("preorder: ");
        _preorder(root); // 재귀 호출
        System.out.println();
    }

    private void _preorder(TreeNode parent) {
        if (parent == null) {
            return;
        }

        System.out.printf("%d ", parent.data);
        _preorder(parent.leftChild);
        _preorder(parent.rightChild);
    }
}

class TreeNode {
    int data; // 데이터
    TreeNode leftChild; // 왼쪽 자식 노드
    TreeNode rightChild; // 오른쪽 자식 노드

    public TreeNode(int data, TreeNode leftChild, TreeNode rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}