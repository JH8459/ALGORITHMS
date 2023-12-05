import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int n = Integer.parseInt(s.split(" ")[0]); // 10진법 수 N
        int b = Integer.parseInt(s.split(" ")[1]); // B (최대 36)

        String result = convertDecimal(n, b);

        bw.write(result + "\n");

        bw.flush();
    }

    // 진법 전환 메서드 (10진법 => B진법)
    public static String convertDecimal(final int n, final int b) {
        if (n < b) {
            return convertNumber(n, b);
        }

        String result = "";
        int temp = n;

        while (temp >= b) {
            int rest = temp % b;
            temp /= b;

            result = convertNumber(rest, b) + result;

            if (temp < b) {
                result = convertNumber(temp, b) + result;
            }
        }

        return result;
    }

    // A~Z 변환 메서드
    public static String convertNumber(final int n, final int b) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (b == 10 || n < 10) {
            return String.valueOf(n);
        } else {
            return alphabet.substring(n - 10, n - 9);
        }
    }
}