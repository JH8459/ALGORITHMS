import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int sum = 0;
    int min = Integer.MAX_VALUE;

    for(int i = 1; i <= 7; i++){
      int num = Integer.parseInt(br.readLine());

      if(num % 2 > 0){
        sum += num;
        min = Math.min(min, num);
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