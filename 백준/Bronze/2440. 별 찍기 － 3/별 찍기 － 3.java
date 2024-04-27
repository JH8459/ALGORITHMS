import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    while (n > 0){
      StringBuilder sb = new StringBuilder();

      for(int i = n; i > 0; i--){
        sb.append("*");
      }

      bw.write(sb + "\n");
      n--;
    }

    bw.flush();
    bw.close();
  }
}