import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++){
      StringBuilder sb = new StringBuilder();

      for(int j = 0; j < i; j++){
        sb.append(" ");
      }

      for(int j = n; j > i; j--){
        sb.append("*");
      }

      bw.write(sb + "\n");
    }

    bw.flush();
    bw.close();
  }
}