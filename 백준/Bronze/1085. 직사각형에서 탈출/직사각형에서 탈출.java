import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int x = Integer.parseInt(s.split(" ")[0]);
        int y = Integer.parseInt(s.split(" ")[1]);
        int w = Integer.parseInt(s.split(" ")[2]);
        int h = Integer.parseInt(s.split(" ")[3]);

        int min = Integer.MAX_VALUE;

        if (x >= y) {
            min = y;
        } else {
            min = x;
        }

        if (w - x <= min) {
            min = w - x;
        }

        if (h - y <= min) {
            min = h - y;
        }

        bw.write(min + "\n");

        bw.flush();
    }
}