import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);

        String[][] arr = new String[n][m]; // 배열 보드판 배열

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            for (int j = 0; j < m; j++) {
                if (line.charAt(j) == 'W') {
                    arr[i][j] = "W";
                } else {
                    arr[i][j] = "B";
                }
            }
        }

        // 사각형 시작 꼭지점 위치 변수 선언
        int startN = n - 7;
        int startM = m - 7;

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < startN; i++) {
            for (int j = 0; j < startM; j++) {
                result = Math.min(result, getCountResult(i, j, arr));
            }
        }

        bw.write(result + "\n");

        bw.flush();
    }

    public static int getCountResult(final int n, final int m, String[][] arr) {
        int result = 0;

        String color = "W"; // 시작 색상 = W

        for (int i = n; i < n + 8; i++) { // 시작 점 N부터 8개까지
            for (int j = m; j < m + 8; j++) { // 시작 점 M부터 8개까지
                if (!arr[i][j].equals(color)) {
                    result++;
                }

                if (color.equals("W")) { // 색상 반전
                    color = "B";
                } else {
                    color = "W";
                }
            }

            if (color.equals("W")) { // 행 변경시 색상 반전
                color = "B";
            } else {
                color = "W";
            }
        }

        result = Math.min(result, 64 - result);

        return result;
    }
}