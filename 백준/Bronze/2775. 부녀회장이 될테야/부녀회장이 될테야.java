import java.io.*;

public class Main {
  public static int[][] apartment;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    apartment = new int[15][15];  // 1 <= n,k <= 14

    for(int i = 0; i < 15; i++) {
      apartment[i][1] = 1; // i층 1호
      apartment[0][i] = i; // 0층 i호
    }

    for(int i = 1; i < 15; i++) { // 1층부터 14층까지
      for(int j = 2; j < 15; j++) { // 2호부터 14호까지
        apartment[i][j] = apartment[i][j - 1] + apartment[i - 1][j];
      }
    }

    int testCase = Integer.parseInt(br.readLine());

    for(int test = 0; test < testCase; test++){
      int k = Integer.parseInt(br.readLine());  // 층 수
      int n = Integer.parseInt(br.readLine());  // 호수

      bw.write(apartment[k][n] + "\n");
    }

    bw.flush();
    bw.close();
  }
}