import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String[] sArr = s.split(" ");

        int length = 0;

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != "") {
                length++;
            }
        }

        bw.write(length + "\n");

        bw.flush();
    }
}