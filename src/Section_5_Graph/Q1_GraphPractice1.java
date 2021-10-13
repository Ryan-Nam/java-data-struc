package Section_5_Graph;

public class Q1_GraphPractice1 {
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
    private int n;          // 정점 수
    private int[][] matrix; // 인접 행렬

    // 정점 V = { 0, 1, ..., n-1 }를 갖는 그래프 생성
    public DirectedGraph(int n) {
        /* 1. 생성자를 완성해주세요. */
    }

    // 간선 <start, end>를 추가
    public void addEdge(int start, int end) {
        /* 2. 해당 메소드를 완성해주세요. */
    }

    // 인점 행렬을 출력
    public void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}