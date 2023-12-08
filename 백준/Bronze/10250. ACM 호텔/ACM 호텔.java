import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            String s = br.readLine();

            int h = Integer.parseInt(s.split(" ")[0]);
            int w = Integer.parseInt(s.split(" ")[1]);
            int n = Integer.parseInt(s.split(" ")[2]);

            for (int k = 1; k <= w; k++) {
                for (int j = 1; j <= h; j++) {
                    n--;

                    if (n == 0) {
                        String result = "";

                        result += String.valueOf(j);

                        if (k < 10) {
                            result = result + "0" + String.valueOf(k);
                        } else {
                            result = result + String.valueOf(k);
                        }

                        bw.write(result + "\n");
                    }
                }
            }
        }

        bw.flush();
    }
}