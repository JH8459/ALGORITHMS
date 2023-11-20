import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sArr = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
        int seconds = 0;
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            String ch = s.split("")[i];

            for (int j = 1; j <= sArr.length; j++) {
                if (sArr[j - 1].contains(ch)) {
                    seconds += (j + 2);
                }
            }
        }

        bw.write(seconds + "\n");

        bw.flush();
    }
}