import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    long n = Long.parseLong(br.readLine());
    long result = 0;

    if(n <= 28){
      if(n == 1){
        result = 1;
      } else if(n > 21){
        result = 7;
      } else if(n > 15){
        result = 6;
      } else if(n > 10){
        result = 5;
      } else if(n > 6){
        result = 4;
      } else if(n > 3){
        result = 3;
      } else if(n > 1){
        result = 2;
      }
    } else {
      result = (n - 29) / 7 + 8;
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}