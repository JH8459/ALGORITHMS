import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    bw.write(Fibonacci(n) + "\n");
    bw.flush();
    bw.close();
  }

  public static int Fibonacci(int n) {
    if(n == 0) return 0;
    if(n == 1) return 1;

    return Fibonacci(n - 1) + Fibonacci(n - 2);
  }
}