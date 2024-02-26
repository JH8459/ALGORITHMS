import java.io.*;
import java.util.*;

public class Main {
  /*
   * 벨만-포드
   * Do it! 알고리즘 코딩 테스트 344.p
   */
  public static int n, m, sCity, eCity;
  public static long[] distance, cityMoney;
  public static Edge[] edges;

  public static class Edge {
    int start, end, price;

    public Edge (int start, int end, int price){
      this.start = start;
      this.end = end;
      this.price = price;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    sCity = Integer.parseInt(st.nextToken());
    eCity = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    edges = new Edge[m];
    distance = new long[n];
    cityMoney = new long[n];

    Arrays.fill(distance, Long.MIN_VALUE);

    for(int i = 0; i < m; i ++){
      st = new StringTokenizer(br.readLine());

      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      int price = Integer.parseInt(st.nextToken());

      edges[i] = new Edge(start, end, price);
    }

    st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++){
      cityMoney[i] = Long.parseLong(st.nextToken());
    }

    distance[sCity] = cityMoney[sCity];

    for(int i = 0; i <= n + 100; i++){
      for(int j = 0; j < m; j++){
        int start = edges[j].start;
        int end = edges[j].end;
        int price = edges[j].price;

        if (distance[start] == Long.MIN_VALUE) {  // 출발 노드가 방문하지 않은 노드라면 skip
          continue;
        } else if (distance[start] == Long.MAX_VALUE){  // 출발 노드가 양수 사이클에 연결된 노드라면 종료 노드도 연결 노드로 업데이트
          distance[end] = Long.MAX_VALUE;
        } else if (distance[end] < distance[start] + cityMoney[end] - price) {  // 더 많은 돈을 벌 수 있는 새로운 경로가 발견됐을 때 새로운 경로값으로 업데이트
          distance[end] = distance[start] + cityMoney[end] - price;

          if(i >= n - 1){ // n -1 반복 이후 업데이트 되는 종료 노드는 양수 사이클 연결 노드로 변경
            distance[end] = Long.MAX_VALUE;
          }
        }
      }
    }

    if(distance[eCity] == Long.MIN_VALUE){
      bw.write("gg\n");
    } else if (distance[eCity] == Long.MAX_VALUE) {
      bw.write("Gee\n");
    } else {
      bw.write(distance[eCity] + "\n");
    }

    bw.flush();
    bw.close();
  }
}