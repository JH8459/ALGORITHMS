import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int cnt = 0;
        int n = Integer.parseInt(br.readLine().split(" ")[0]);

        for (int i = 0; i < n; i++) {
            boolean[] alphabetBooleanArr = new boolean[alphabet.length()]; // boolean Array 선언시 기본값 false 초기화
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                int nowIdx = alphabet.indexOf(s.charAt(j));

                if (j == 0) {
                    alphabetBooleanArr[nowIdx] = true;
                } else {
                    int prevIdx = alphabet.indexOf(s.charAt(j - 1));

                    if (nowIdx != prevIdx) {
                        if (alphabetBooleanArr[nowIdx]) {
                            break;
                        }
                    }

                    alphabetBooleanArr[nowIdx] = true;
                }

                if (j == s.length() - 1) {
                    cnt++;
                }
            }
        }

        bw.write(cnt + "\n");

        bw.flush();
    }
}