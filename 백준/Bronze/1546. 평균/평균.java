import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().split(" ")[0]);
        double maxScore = Integer.MIN_VALUE;

        int[] intArr = new int[n];

        String exam = br.readLine();

        for (int idx = 0; idx < n; idx++) {
            int score = Integer.parseInt(exam.split(" ")[idx]);

            if (score >= maxScore) {
                maxScore = score;
            }

            intArr[idx] = score;
        }

        double convertScoreSum = 0;

        for (int i = 0; i < intArr.length; i++) {
            convertScoreSum += (intArr[i] / maxScore) * 100;
        }

        bw.write(convertScoreSum / intArr.length + "\n");

        bw.flush(); // Buffer Flush
    }
}