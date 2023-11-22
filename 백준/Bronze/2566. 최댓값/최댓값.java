import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] matrix = new int[9][9];
        int max = Integer.MIN_VALUE;
        int x = 0, y = 0;

        // 행렬
        for (int i = 0; i < 9; i++) {
            String rowS = br.readLine();
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(rowS.split(" ")[j]);

                if (matrix[i][j] >= max) {
                    max = matrix[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        bw.write(max + "\n" + x + " " + y + "\n");

        bw.flush();
    }
}