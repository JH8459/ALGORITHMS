import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double scoreSum = 0;
        double totalSum = 0;

        while (true) {
            String s = br.readLine();

            if (s == null || s.isEmpty()) {
                break;
            }

            double score = Double.parseDouble(s.split(" ")[1]);
            String grade = s.split(" ")[2];

            double convertScore = 0;

            if (grade.equals("A+")) {
                convertScore = score * 4.5;
            } else if (grade.equals("A0")) {
                convertScore = score * 4.0;
            } else if (grade.equals("B+")) {
                convertScore = score * 3.5;
            } else if (grade.equals("B0")) {
                convertScore = score * 3.0;
            } else if (grade.equals("C+")) {
                convertScore = score * 2.5;
            } else if (grade.equals("C0")) {
                convertScore = score * 2.0;
            } else if (grade.equals("D+")) {
                convertScore = score * 1.5;
            } else if (grade.equals("D0")) {
                convertScore = score * 1.0;
            } else if (grade.equals("F")) {
                convertScore = score * 0;
            }

            if (!grade.equals("P")) {
                scoreSum += convertScore;
                totalSum += score;
            }
        }

        bw.write(scoreSum / totalSum + "\n");

        bw.flush();
    }
}