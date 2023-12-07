import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String result = "";
        String ascending = "12345678";
        String descending = "87654321";

        for (int i = 0; i <= s.length() / 2; i++) {
            result = result + Integer.parseInt(s.split(" ")[i]);
        }

        if (result.equals(ascending)) {
            bw.write("ascending\n");
        } else if (result.equals(descending)) {
            bw.write("descending\n");
        } else {
            bw.write("mixed\n");
        }

        bw.flush();
    }
}