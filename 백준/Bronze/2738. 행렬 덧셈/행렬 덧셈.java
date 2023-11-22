import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);

        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[n][m];

        // 행렬1
        for (int i = 0; i < n; i++) {
            String rowS = br.readLine();
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = Integer.parseInt(rowS.split(" ")[j]);
            }
        }
        // 행렬2
        for (int i = 0; i < n; i++) {
            String rowS = br.readLine();
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = Integer.parseInt(rowS.split(" ")[j]);
            }
        }
        // 합산 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(matrix1[i][j] + matrix2[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
    }
}