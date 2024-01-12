import java.io.*;
import java.util.*;

public class Main {
  public static class Point{
    int x;
    int y;

    public Point (int x, int y) {
      this.x = x;
      this.y = y;
    }
  };

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    Point[] pointArr = new Point[n];  // 좌표 정보를 담을 배열 선언

    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      pointArr[i] = new Point(x, y);
    }

    Arrays.sort(pointArr, (pointA, pointB) -> {
      // 커스텀 정렬
      if(pointA.y == pointB.y){
        return pointA.x - pointB.x;
      } else {
        return pointA.y - pointB.y;
      }
    });

    for(Point point: pointArr){
      bw.write(point.x + " " + point.y + "\n");
    }

    bw.flush();
    bw.close();
  }
}