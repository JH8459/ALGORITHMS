import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] nArr = new int[9];
    int sum = 0;

    for(int i = 0; i < 9; i++){
      nArr[i] = Integer.parseInt(br.readLine());
      sum += nArr[i];
    }

    for (int i = 0; i < 8; i++) {
      for (int j = i + 1; j < 9; j++) {
        int current = nArr[i] + nArr[j];
        if (sum - current == 100) {
          nArr[i] = 0;
          nArr[j] = 0;

          for (int k = 0; k < 9; k++) {
            if (k != i && k != j) {
              bw.write(nArr[k] + "\n");
            }
          }
        }
      }
    }

    bw.flush();
    bw.close();
  }
}