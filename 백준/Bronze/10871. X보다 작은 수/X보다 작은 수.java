import java.io.*; // Scanner(java.util 클래스)와 달리 BufferReader는 java.io 클래스를 import한다.

public class Main {
    public static void main(String args[]) throws IOException { // BufferReader는 IOExeption의 예외처리가 필수이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstLine = br.readLine();

        int n = Integer.parseInt(firstLine.split(" ")[0]);
        int x = Integer.parseInt(firstLine.split(" ")[1]);

        int[] intArr = new int[n];

        String secondLine = br.readLine();

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(secondLine.split(" ")[i]);

            intArr[i] = number;
        }

        for (int i = 0; i < n; i++) {
            if (intArr[i] < x) {
                bw.write(intArr[i] + " ");
            }
        }

        bw.write("\n");

        bw.flush(); // Buffer Flush
    }
}