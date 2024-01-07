import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    for(int i = n; i <= m; i++){
      if(isPrime(i)){
        bw.write(i + "\n");
      }
    }

    bw.flush();
    bw.close();
  }

  public static boolean isPrime(int num){
    if(num > 2){
      for(int i = 2; i <= Math.sqrt(num); i++){
        if(num % i == 0){
          return false;
        }
      }

      return true;
    } else if (num == 2) {
      return true;
    } else {
      return false;
    }
  }
}