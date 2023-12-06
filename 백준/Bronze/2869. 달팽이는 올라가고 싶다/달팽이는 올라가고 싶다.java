import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int a = Integer.parseInt(s.split(" ")[0]); // A (올라갈 수 있는 높이)
        int b = Integer.parseInt(s.split(" ")[1]); // B (미끄러지는 높이)
        int v = Integer.parseInt(s.split(" ")[2]); // V (나무 막대 높이)

        bw.write(getResult(a, b, v) + "\n");

        bw.flush();
    }

    // 달팽이가 나무 막대를 올라가는 일수를 구하는 메서드
    public static int getResult(final int a, final int b, final int v) {
        int result = (v - b) / (a - b);

        // 남은 나무 막대 길이가 있을 경우
        if ((v - b) % (a - b) != 0) {
            result++;
        }

        return result;
    }
}