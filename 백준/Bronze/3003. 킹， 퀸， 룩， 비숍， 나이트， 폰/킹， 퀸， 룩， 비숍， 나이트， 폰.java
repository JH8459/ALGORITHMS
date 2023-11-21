import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chessArr = { 1, 1, 2, 2, 2, 8 };

        String s = br.readLine();

        for (int i = 0; i < chessArr.length; i++) {
            int chessCnt = Integer.parseInt(s.split(" ")[i]);

            bw.write(chessArr[i] - chessCnt + " ");
        }

        bw.flush();
    }
}