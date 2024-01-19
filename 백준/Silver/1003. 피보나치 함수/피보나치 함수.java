import java.io.*;

public class Main {
  public static Integer[][] dp;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int testCase = Integer.parseInt(br.readLine());

    dp = new Integer[41][2];  // 0 ~ 40까지 0과 1이 출력되는 경우를 담을 메모이제이션 배열

    dp[0][0] = 1;	// n == 0 ~> 0 호출 회수
    dp[0][1] = 0; // n == 0 ~> 1 호출 회수
    dp[1][0] = 0;	// n == 1 ~> 0 호출 회수
    dp[1][1] = 1;	// n == 1 ~> 1 호출 회수

    for(int test = 0; test < testCase; test++){
      int n = Integer.parseInt(br.readLine());  // 최대 40

      fibonacci(n);

      bw.write( dp[n][0] + " " + dp[n][1] + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static Integer[] fibonacci(int n) {
    // n에 대한 0, 1의 호출 회수가 없는 경우
    if(dp[n][0] == null || dp[n][1] == null) {
      // 각 N에 대한 0 호출 횟수와 1 호출 횟수를 탐색한다. (재귀)
      dp[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
      dp[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
    }
    
    return dp[n];
  }
}