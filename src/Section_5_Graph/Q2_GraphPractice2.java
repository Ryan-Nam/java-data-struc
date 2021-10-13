package Section_5_Graph;

public class Q2_GraphPractice2 {
    public static void main(String[] args) {
        // 입력값 받기
        Scanner input = new Scanner(String.join(" ", args));

        // 변수 생성
        int nodeCnt = input.nextInt(); // 정점 수
        int lineCnt = input.nextInt(); // 간선 수

        // 그래프 및 정점 생성
        DirectedGraph graph = new DirectedGraph(nodeCnt);

        // 간선 추가
        for (int i = 0; i < lineCnt; i++) {
            int startNode = input.nextInt();
            int endNode = input.nextInt();
            graph.addEdge(startNode, endNode);
        }

        // 인접행렬 출력
        graph.printMatrix();
    }
}

class DirectedGraph {
    private int n;       // 정점 수
    private Node[] list; // 인접 리스트

    // 정점 V = { 0, 1, ..., n-1 }를 갖는 그래프 생성
    public DirectedGraph(int n) {
        /* 1. 그래프의 생성자를 작성하세요. */
    }

    // 간선 <start, end>를 추가
    public void addEdge(int start, int end) {
        /* 2. 간선 추가 메소드를 구현하세요. */
    }

    // 모든 인접 리스트를 출력
    public void printMatrix() {
        /* 3. 각 정점에 대해 연결된 정점들을 출력하세요. */
    }
}

class Node {
    int vertex;
    Node next;

    public Node(int vertex, Node next) {
        this.vertex = vertex;
        this.next = next;
    }
}
