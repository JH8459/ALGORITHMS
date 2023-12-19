import java.io.*;
import java.util.*;

public class Main {

  public static int[] distance; // 거리 저장 배열
  public static boolean[] isVisited;  // 방문 기록 저장 배열
  public static ArrayList<Edge>[] edgeList;  // 트리 데이터를 저장할 인접 리스트

  public static class Edge {

    int edge;
    int weight;

    public Edge(int edge, int value) {
      this.edge = edge;
      this.weight = value;
    }
  }

  public static void main(String args[]) throws IOException {
    /*
     * 탐색 - 너비 우선 탐색 => O(v + e)  // v는 노드 수, e는 엣지 수
     * Do to! 코딩 테스트 174.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int v = Integer.parseInt(br.readLine()); // 트리 정점의 개수 v
    int max = 1;  // 간선 간 길이의 최대값을 찾기 위한 INDEX 변수

    edgeList = new ArrayList[v + 1];
    // 인접리스트 초기화
    for (int i = 1; i <= v; i++) {
      edgeList[i] = new ArrayList<Edge>();
    }

    for (int i = 0; i < v; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken()); // 시작 노드 번호

      while (true) {
        int end = Integer.parseInt(st.nextToken()); // 연결된 노드 번호

        if (end == -1) {
          break;
        }

        int weight = Integer.parseInt(st.nextToken());  // 두 정점간 거리

        edgeList[start].add(new Edge(end, weight)); // 인접리스트에 간선 데이터 저장
      }
    }
    // 거리 & 방문 배열 초기화
    distance = new int[v + 1];
    isVisited = new boolean[v + 1];
    // 너비 우선 탐색 실행 (임의 노드 시작점)
    bfs(1);
    // distance 배열에서 가장 큰 값으로 시작점 재 설정 (길이가 가장 긴 간선)
    for (int i = 2; i <= v; i++) {
      if (distance[max] < distance[i]) {
        max = i;
      }
    }
    // 배열 초기화 후 너비 우선 탐색 실행 (최대 길이 간선 노드 시작점)
    distance = new int[v + 1];
    isVisited = new boolean[v + 1];
    bfs(max);

    Arrays.sort(distance);
    System.out.println(distance[v]);
  }

  public static void bfs(int index) {
    Queue<Integer> queue = new LinkedList<Integer>();

    queue.add(index);
    isVisited[index] = true;

    while (!queue.isEmpty()) {
      int now = queue.poll();

      for (Edge i : edgeList[now]) {
        int edge = i.edge;
        int weight = i.weight;

        if (!isVisited[edge]) {
          isVisited[edge] = true;
          queue.add(edge);
          distance[edge] = distance[now] + weight;  // 거리 배열 업데이트
        }
      }
    }
  }
}