import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;

        if (n <= 1) {
            bw.write(0 + "\n");

        } else {
            for (int i = 0; i < n; i++) {
                String s = br.readLine();

                int x = Integer.parseInt(s.split(" ")[0]);
                int y = Integer.parseInt(s.split(" ")[1]);

                if (minX >= x)
                    minX = x;

                if (maxX <= x)
                    maxX = x;

                if (minY >= y)
                    minY = y;

                if (maxY <= y)
                    maxY = y;
            }

            bw.write((maxX - minX) * (maxY - minY) + "\n");
        }

        bw.flush();
    }
}