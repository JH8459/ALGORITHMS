import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int result = 0;

    for(int i = 1; i <= 5; i++){
      result += Integer.parseInt(br.readLine());
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}