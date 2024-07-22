import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    HashSet<Integer> kSet = new HashSet<>();

    for(int i = 0; i < m; i++){
      int k = Integer.parseInt(st.nextToken());
      int kSum = k;

      while (kSum <= n){
        kSet.add(kSum);

        kSum += k;
      }
    }

    int result = 0;


    for(int num : kSet){
      result += num;
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}