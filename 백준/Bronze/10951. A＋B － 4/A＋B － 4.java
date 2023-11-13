import java.io.*; // Scanner(java.util 클래스)와 달리 BufferReader는 java.io 클래스를 import한다.

public class Main {
    public static void main(String args[]) throws IOException { // BufferReader는 IOExeption의 예외처리가 필수이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();

            if (s == null) {
                // BufferedReader EOF 처리
                break;
            }

            int a = Integer.parseInt(s.split(" ")[0]); // 빈 문자열로 구분하여 a, b 정수 데이터 입력
            int b = Integer.parseInt(s.split(" ")[1]);

            bw.write((a + b) + "\n"); // bw를 통해 출력
        }

        bw.flush(); // Buffer Flush
    }
}