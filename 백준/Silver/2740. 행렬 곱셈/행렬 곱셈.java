import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[][] matrix1 = new int[n][m];

    for(int i = 0; i < n; i++){
      st = new StringTokenizer(br.readLine());

      for(int j = 0; j < m; j++){
        matrix1[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    st = new StringTokenizer(br.readLine());
    m = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[][] matrix2 = new int[m][k];

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());

      for(int j = 0; j < k; j++){
        matrix2[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int[][] result = new int[n][k];

    for(int i = 0; i < n; i++){
      for(int j = 0; j < k; j++){
        for(int l = 0; l < m; l++){
          result[i][j] += matrix1[i][l] * matrix2[l][j];
        }
      }
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < k; j++){
        bw.write(result[i][j] + " ");
      }

      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}