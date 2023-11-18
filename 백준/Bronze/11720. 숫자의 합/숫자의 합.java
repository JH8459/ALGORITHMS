import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().split(" ")[0]);
        String s = br.readLine();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(s.split("")[i]);
        }

        bw.write(sum + "\n");

        bw.flush();
    }
}