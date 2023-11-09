import java.io.*; // Scanner(java.util 클래스)와 달리 BufferReader는 java.io 클래스를 import한다.

public class Main {
    public static void main(String args[]) throws IOException { // BufferReader는 IOExeption의 예외처리가 필수이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 입력받은 데이터가 줄마다 String으로 반환되므로 int 형변환 처리.

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();

            int a = Integer.parseInt(s.split(" ")[0]); // 빈 문자열로 구분하여 a, b 정수 데이터 입력
            int b = Integer.parseInt(s.split(" ")[1]);

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n"); // bw를 통해 출력
        }

        bw.flush(); // Buffer Flush
    }
}