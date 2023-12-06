import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // N

        bw.write(getRoomCnt(n) + "\n");

        bw.flush();
    }

    // 몇개의 방을 지나갔는지 카운팅하는 메서드
    public static int getRoomCnt(final int n) {
        int cnt = 1; // 몇개의 방을 지나쳤는지 카운팅하는 변수 (벌집의 겹 수)
        int range = 2; // 범위

        if (n == 1) {
            return 1;
        } else {
            while (range <= n) {
                range = range + (cnt * 6);
                cnt++;
            }

            return cnt;
        }

    }
}