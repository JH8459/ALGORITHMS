import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 5, m = 15;
        String[][] matrix = new String[n][m];

        // 행렬
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                matrix[i][j] = s.split("")[j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[j][i] != null) {
                    bw.write(matrix[j][i]);
                }
            }
        }

        bw.flush();
    }
}