import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().split(" ")[0]);

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            int cnt = Integer.parseInt(s.split(" ")[0]);
            String alphabet = s.split(" ")[1];

            for (int j = 0; j < alphabet.length(); j++) {
                for (int k = 0; k < cnt; k++) {
                    bw.write(alphabet.charAt(j) + "");
                }
            }

            bw.write("\n");
        }

        bw.flush();
    }
}