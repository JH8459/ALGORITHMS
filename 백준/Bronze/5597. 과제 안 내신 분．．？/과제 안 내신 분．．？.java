import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 28;
        int[] intArr = new int[30];

        while (cnt-- > 0) {
            int studentNumber = Integer.parseInt(br.readLine());

            intArr[studentNumber - 1] = studentNumber;
        }

        int firstNum = 0;
        int lastNum = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 0) {
                if (firstNum == 0) {
                    firstNum = i + 1;
                } else {
                    lastNum = i + 1;
                }
            }
        }

        bw.write(firstNum + "\n" + lastNum);

        bw.flush(); // Buffer Flush
    }
}