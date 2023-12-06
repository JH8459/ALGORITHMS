import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            boolean isTarget = true;
            int num = Integer.parseInt(s.split(" ")[i]);

            if (num != 1) {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isTarget = false;
                    }
                }

                if (isTarget == true)
                    cnt++;
            }
        }

        bw.write(cnt + "\n");

        bw.flush();
    }
}