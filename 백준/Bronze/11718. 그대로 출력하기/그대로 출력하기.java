import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 100;

        while (cnt > 0) {
            String s = br.readLine();

            if (s == null || s.isEmpty()) {
                break;
            }

            bw.write(s + "\n");

            cnt--;
        }

        bw.flush();
    }
}