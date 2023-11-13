import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE; // Integer Type 최소값
        int lineNumber = 0;

        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number > max) {
                max = number;
                lineNumber = i + 1;
            }
        }

        bw.write(max + "\n" + lineNumber + "\n");

        bw.flush(); // Buffer Flush
    }
}