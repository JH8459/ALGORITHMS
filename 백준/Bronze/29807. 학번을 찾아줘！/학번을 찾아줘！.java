import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[3];
    int[] score = new int[5];

    int num = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      score[i] = Integer.parseInt(st.nextToken());
    }

    if (score[0] > score[2]) {
      arr[0] = Math.abs(score[0] - score[2]) * 508;
    } else {
      arr[0] = Math.abs(score[0] - score[2]) * 108;
    }

    if (score[1] > score[3]) {
      arr[1] = Math.abs(score[1] - score[3]) * 212;
    } else {
      arr[1] = Math.abs(score[1] - score[3]) * 305;
    }

    if (score[4] > 0) {
      arr[2] = score[4] * 707;
    }

    for (int i : arr) {
      num += i;
    }

    num *= 4763;

    bw.write(num + "\n");
    bw.flush();
    bw.close();
  }
}