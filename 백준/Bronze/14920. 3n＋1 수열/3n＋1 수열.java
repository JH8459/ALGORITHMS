import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int result = 1;

    while (n != 1) {
      n = C(n);
      result++;
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }

  public static int C(int num) {
    if(num % 2 == 0){
      return num / 2;
    } else {
      return 3 * num + 1;
    }
  }
}