import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sum = Integer.parseInt(br.readLine());

    for(int i = 0; i < 9; i++){
      sum -= Integer.parseInt(br.readLine());
    }

    bw.write(sum + "\n");
    bw.flush();
    bw.close();
  }
}