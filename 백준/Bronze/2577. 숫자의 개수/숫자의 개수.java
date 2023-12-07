import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        getResult(a * b * c);
    }

    public static void getResult(final int num) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = String.valueOf(num);

        for (int i = 0; i <= 9; i++) {
            int cnt = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == String.valueOf(i).charAt(0)) {
                    cnt++;
                }
            }

            bw.write(cnt + "\n");
        }

        bw.flush();
    }
}