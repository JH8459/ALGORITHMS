import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double n = Double.parseDouble(br.readLine()); // N

        bw.write((int) getPointCnt(n) + "\n");

        bw.flush();
    }

    // 점의 갯수 반환 메서드
    public static double getPointCnt(final double n) {
        double result = Math.pow(Math.pow(2, n) + 1, 2);

        return result;
    }
}