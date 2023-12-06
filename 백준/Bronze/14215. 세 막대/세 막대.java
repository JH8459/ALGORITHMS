import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int a = Integer.parseInt(s.split(" ")[0]);
        int b = Integer.parseInt(s.split(" ")[1]);
        int c = Integer.parseInt(s.split(" ")[2]);

        if (isTriangle(a, b, c)) {
            bw.write(a + b + c + "\n");
        } else {
            bw.write((a + b + c - getMaxLength(a, b, c)) * 2 - 1 + "\n");
        }

        bw.flush();

    }

    // 삼각형 여부를 판별하는 메서드
    public static boolean isTriangle(final int a, final int b, final int c) {
        int maxNum = getMaxLength(a, b, c);
        int sum = 0;

        if (maxNum == a) {
            sum = b + c;
        } else if (maxNum == b) {
            sum = a + c;
        } else {
            sum = a + b;
        }

        if (maxNum < sum) {
            return true;
        } else {
            return false;
        }
    }

    // 3개의 정수 중 최대값을 구하는 메서드
    public static int getMaxLength(final int a, final int b, final int c) {
        int maxNum = Integer.MIN_VALUE;

        if (maxNum <= a) {
            maxNum = a;
        }

        if (maxNum <= b) {
            maxNum = b;
        }

        if (maxNum <= c) {
            maxNum = c;
        }

        return maxNum;
    }
}