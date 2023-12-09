import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        /*
         * 구간 합 알고리즘
         * Do to! 코딩 테스트 44.p
         * 합 배열을 이용하여 시간 복잡도 개선 O(n) => O(1)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 줄에 수의 갯수 N
        int m = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수 M

        long[] nSumArr = new long[n + 1]; // 합배열 nSumArr

        st = new StringTokenizer(br.readLine()); // 줄에 담긴 수를 받을 문자열

        for (int cnt = 1; cnt <= n; cnt++) {
            int num = Integer.parseInt(st.nextToken());

            nSumArr[cnt] = nSumArr[cnt - 1] + num;
        }

        for (int cnt = 0; cnt < m; cnt++) {
            st = new StringTokenizer(br.readLine()); // 줄에 담긴 수를 받을 문자열

            int i = Integer.parseInt(st.nextToken()); // 시작 위치
            int j = Integer.parseInt(st.nextToken()); // 종료 위치

            System.out.println(nSumArr[j] - nSumArr[i - 1]);
        }
    }
}