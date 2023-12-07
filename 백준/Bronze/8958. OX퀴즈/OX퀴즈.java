import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int score = 0;
            int benefit = 1;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    score += benefit;
                    benefit++;
                } else {
                    benefit = 1;
                }
            }

            bw.write(score + "\n");
        }

        bw.flush();
    }
}