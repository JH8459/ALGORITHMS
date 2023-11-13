import java.io.*; // Scanner(java.util 클래스)와 달리 BufferReader는 java.io 클래스를 import한다.

public class Main {
    public static void main(String args[]) throws IOException { // BufferReader는 IOExeption의 예외처리가 필수이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] intArr = new int[n];

        String s = br.readLine();

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(s.split(" ")[i]);

            intArr[i] = number;
        }

        int findInt = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < n; i++) {
            if (intArr[i] == findInt) {
                result++;
            }
        }

        bw.write(result + "\n"); // bw를 통해 출력

        bw.flush(); // Buffer Flush
    }
}