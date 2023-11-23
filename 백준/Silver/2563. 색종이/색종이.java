import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 100, m = 100;
        int[][] matrix = new int[n][m];

        int num = Integer.parseInt(br.readLine().split(" ")[0]);

        // 행렬
        for (int i = 0; i < num; i++) {
            String s = br.readLine();

            int x = Integer.parseInt(s.split(" ")[0]);
            int y = Integer.parseInt(s.split(" ")[1]);

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    matrix[j][k] = 1;
                }
            }
        }

        int result = getFindOne(matrix, n, m);

        bw.write(result + "\n");

        bw.flush();
    }

    // getFindOne 메서드 추가
    public static int getFindOne(final int[][] matrix, final int n, final int m) { // final 키워드 (수정할 수 없는 값 일 경우)
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}