import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] alphabetArr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        String s = br.readLine();

        for (int i = 0; i < alphabetArr.length; i++) {
            if (s.contains(alphabetArr[i])) {
                s = s.replace(alphabetArr[i], " ");
            }
        }

        bw.write(s.length() + "\n");

        bw.flush();
    }
}