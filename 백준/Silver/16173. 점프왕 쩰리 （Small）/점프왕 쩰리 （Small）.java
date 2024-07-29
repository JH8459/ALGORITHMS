import java.io.*;
import java.util.*;

public class Main {
  public static int n;
  public static int[] dx = {0, 1};
  public static int[] dy = {1, 0};
  public static boolean[][] isVisitedArr;
  public static int[][] mapArr;
  public static boolean isComplete = false;

  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(br.readLine());
    isVisitedArr = new boolean[n][n];
    mapArr = new int[n][n];

    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int j = 0; j < n; j++){
        mapArr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int x = 0, y = 0;
    isVisitedArr[x][y] = true;
    dfs(x, y);

    bw.write(isComplete ? "HaruHaru" : "Hing" + "\n");
    bw.flush();
    bw.close();
  }

  public static void dfs(int x, int y){
    if(mapArr[x][y] == -1){
      isComplete = true;
    }

    for(int i = 0; i < 2; i++){
      int nX = x + dx[i] * mapArr[x][y];
      int nY = y + dy[i] * mapArr[x][y];

      if(nX >= n || nY >= n || isVisitedArr[nX][nY]){
        continue;
      }

      isVisitedArr[nX][nY] = true;

      dfs(nX, nY);
    }
  }
}