import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int a = Integer.parseInt(s.split(" ")[0]);
        int b = Integer.parseInt(s.split(" ")[1]);
        int c = Integer.parseInt(s.split(" ")[2]);
        int d = Integer.parseInt(s.split(" ")[3]);
        int e = Integer.parseInt(s.split(" ")[4]);

        bw.write(getResult(a, b, c, d, e) + "\n");

        bw.flush();
    }

    public static int getResult(final int a, final int b, final int c, final int d, final int e) {
        int result = 0;

        result = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) + Math.pow(d, 2) + Math.pow(e, 2)) % 10;

        return result;
    }
}