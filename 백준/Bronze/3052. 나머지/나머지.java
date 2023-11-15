import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int idx = 10;
        int[] intArr = new int[idx];

        while (idx-- > 0) {
            int n = Integer.parseInt(br.readLine()) % 42;

            intArr[9 - idx] = n;
        }

        int[] distinctArr = Arrays.stream(intArr).distinct().toArray(); // intArr 중복값 제거

        bw.write(distinctArr.length + "\n");

        bw.flush(); // Buffer Flush
    }
}