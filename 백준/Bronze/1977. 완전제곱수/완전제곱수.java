import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int m = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    int min = Integer.MAX_VALUE;
    int sum = 0;

    for(int i = 1; i <= 100; i++){
      int pow = (int) Math.pow(i, 2);

      if(pow > n){
        break;
      }

      if(pow >= m && pow <= n){
        min = Math.min(min, pow);
        sum += pow;
      }
    }

    if(sum > 0){
      bw.write(sum + "\n" + min + "\n");
    } else {
      bw.write(-1 + "\n");
    }
    
    bw.flush();
    bw.close();
  }
}