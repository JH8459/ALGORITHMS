import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String n = s.split(" ")[0]; // B진법 수 N
        int b = Integer.parseInt(s.split(" ")[1]); // B (최대 36)

        int result = convertDecimal(n, b);

        bw.write(result + "\n");

        bw.flush();
    }

    // 진법 전환 메서드 (B진법 => 10진법)
    public static int convertDecimal(final String n, final int b) {
        int result = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            if (b <= 10) {
                char ch = n.charAt(n.length() - 1 - i);

                double convertDecimal = Integer.parseInt(Character.toString(ch)) * Math.pow(b, i);

                result += convertDecimal;
            } else {
                String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

                char ch = n.charAt(n.length() - 1 - i);

                double convertDecimal = 0;

                if (alphabet.indexOf(ch) >= 0) {
                    convertDecimal = (Character.getNumericValue(ch)) * Math.pow(b, i); // ASCII 변환
                } else {
                    convertDecimal = Integer.parseInt(Character.toString(ch)) * Math.pow(b, i);
                }

                result += convertDecimal;
            }
        }

        return result;
    }
}