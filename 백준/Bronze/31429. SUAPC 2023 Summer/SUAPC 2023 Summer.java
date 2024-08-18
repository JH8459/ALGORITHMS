import java.io.*;

public class Main {
  public static int[] score = {
    12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6};
  public static int[] penalty = {1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773};

  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    bw.write(score[n - 1] + " " + penalty[n - 1] + "\n");

    bw.flush();
    bw.close();
  }
}