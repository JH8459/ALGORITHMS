import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    long[] distanceArr = new long[n - 1];
    long[] priceArr = new long[n];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n - 1; i++){
      distanceArr[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++){
      priceArr[i] = Integer.parseInt(st.nextToken());
    }

    long result = 0;

    for(int i = 0; i < n - 1; i++){
      long price = priceArr[i];
      long distance = 0;

      for(int j = i + 1; j < n; j++){
        distance += distanceArr[i];

        if(price > priceArr[j]){
          break;
        }

        i += 1;
      }

      result += price * distance;
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}