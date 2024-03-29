import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();

            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);

            if (a + b == 0)
                break;

            if (a % b == 0) {
                bw.write("multiple\n");
            } else if (b % a == 0) {
                bw.write("factor\n");
            } else {
                bw.write("neither\n");
            }
        }

        bw.flush();
    }
}