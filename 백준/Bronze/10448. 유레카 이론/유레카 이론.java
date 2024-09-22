import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] triangleArr = new int[45];

    for (int i = 1; i < 45; i++){
      triangleArr[i] = i * (i + 1) / 2;
    }

    while (n-- > 0){
      int num = Integer.parseInt(br.readLine());

      bw.write(isEureka(triangleArr, num) + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static int isEureka(int[] triangleArr, int n) {
    for (int i = 1; i < 45; i++) {
      for (int j = i; j < 45; j++) {
        for (int k = j; k < 45; k++) {
          if (triangleArr[i] + triangleArr[j] + triangleArr[k] == n) {
            return 1;
          }
        }
      }
    }

    return 0;
  }
}