import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();

            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            int c = Integer.parseInt(s.split(" ")[2]);

            if (a + b + c == 0)
                break;

            if (isTriangle(a, b, c)) {
                if (a == b && b == c) {
                    bw.write("Equilateral\n");
                } else if (a == b || b == c || c == a) {
                    bw.write("Isosceles\n");
                } else {
                    bw.write("Scalene\n");
                }
            } else {
                bw.write("Invalid\n");
            }
        }

        bw.flush();
    }

    // 삼각형 여부를 판별하는 메서드
    public static boolean isTriangle(final int a, final int b, final int c) {
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        if (maxNum <= a) {
            maxNum = a;
            sum = b + c;
        }

        if (maxNum <= b) {
            maxNum = b;
            sum = a + c;
        }

        if (maxNum <= c) {
            maxNum = c;
            sum = a + b;
        }

        if (maxNum < sum) {
            return true;
        } else {
            return false;
        }
    }
}