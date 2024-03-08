import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    int[] arr = {300, 60, 10};

    if(n % 10 != 0){
      bw.write("-1\n");
    } else {
      StringBuilder result = new StringBuilder();

      for (int i = 0; i < arr.length; i++) {
        result.append(n / arr[i]).append(" ");
        n %= arr[i];
      }

      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
  }
}