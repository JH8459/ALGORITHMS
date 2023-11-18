import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().split(" ")[0]);

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            String firstChar = s.substring(0, 1);
            String lastChar = s.substring(s.length() - 1, s.length());

            bw.write(firstChar + lastChar + "\n");
        }

        bw.flush();
    }
}