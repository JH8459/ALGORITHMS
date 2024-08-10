import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    while (true){
      int num = Integer.parseInt(br.readLine());
      boolean isMultiple = num %  n == 0;

      if(num == 0){
        break;
      }

      if(isMultiple){
        bw.write(num + " is a multiple of " + n + ".\n");
      } else {
        bw.write(num + " is NOT a multiple of " + n + ".\n");
      }
    }

    bw.flush();
    bw.close();
  }
}