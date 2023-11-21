import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int isResult = 1;

        for (int i = 0; i < s.length(); i++) {
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(s.length() - (i + 1));

            if (leftChar != rightChar) {
                isResult = 0;
                break;
            }
        }

        bw.write(isResult + "\n");

        bw.flush();
    }
}