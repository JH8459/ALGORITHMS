import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[][] score = new int[8][2];

    for (int i = 0; i < 8; i++) {
      score[i][0] = Integer.parseInt(br.readLine());
      score[i][1] = i + 1;
    }

    Arrays.sort(score, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return Integer.compare(o2[0], o1[0]);
      }
    });

    StringBuilder sb = new StringBuilder();

    ArrayList<Integer> index = new ArrayList<>();

    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += score[i][0];
      index.add(score[i][1]);
    }

    Collections.sort(index);

    for(int i : index) {
      sb.append(i).append(" ");
    }
    
    bw.write(sum + "\n" + sb + "\n");
    bw.flush();
    bw.close();
  }
}