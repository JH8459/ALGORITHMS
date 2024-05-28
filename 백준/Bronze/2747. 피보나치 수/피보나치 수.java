import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int f1 = 0; int f2 = 1;
    int answer = f1 + f2;

    for(int i = 2; i < n; i++) {
      f1 = f2;
      f2 = answer;
      
      answer = f1 + f2;
    }

    bw.write(answer + "\n");
    bw.flush();
    bw.close();
  }
}