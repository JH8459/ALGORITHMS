import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        int x1 = Integer.parseInt(s1.split(" ")[0]);
        int y1 = Integer.parseInt(s1.split(" ")[1]);

        String s2 = br.readLine();
        int x2 = Integer.parseInt(s2.split(" ")[0]);
        int y2 = Integer.parseInt(s2.split(" ")[1]);

        String s3 = br.readLine();
        int x3 = Integer.parseInt(s3.split(" ")[0]);
        int y3 = Integer.parseInt(s3.split(" ")[1]);

        int[] xArr = { x1, x2, x3 };
        int[] yArr = { y1, y2, y3 };

        bw.write(findDifferent(xArr) + " " + findDifferent(yArr) + "\n");

        bw.flush();
    }

    public static int findDifferent(final int[] numArr) {
        int result = 0;

        // XOR 연산으로 다른 값 찾기
        for (int value : numArr) {
            result ^= value;
        }
        return result;
    }
}