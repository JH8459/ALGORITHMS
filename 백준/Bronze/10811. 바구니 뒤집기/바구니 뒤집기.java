import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);

        int[] intArr = new int[n];

        for (int idx = 0; idx < n; idx++) {
            intArr[idx] = idx + 1;
        }

        for (int cnt = 0; cnt < m; cnt++) {
            String solution = br.readLine();
            int i = Integer.parseInt(solution.split(" ")[0]) - 1;
            int j = Integer.parseInt(solution.split(" ")[1]) - 1;

            for (int solutionNum = i; solutionNum <= j; solutionNum++) {
                int minusJ = j--;

                int temp = intArr[solutionNum];

                intArr[solutionNum] = intArr[minusJ];
                intArr[minusJ] = temp;
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            bw.write(intArr[i] + " ");
        }

        bw.flush(); // Buffer Flush
    }
}