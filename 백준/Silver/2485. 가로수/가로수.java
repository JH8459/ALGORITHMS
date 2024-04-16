import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] streetTree =new int[n];

    for(int i = 0; i < n; i++){
      streetTree[i] = Integer.parseInt(br.readLine());
    }

    int gcd = 0;

    for(int i = 0; i < n - 1; i++){
      int distanceGap = streetTree[i + 1] - streetTree[i];
      gcd = findGCD(distanceGap, gcd);
    }

    bw.write((streetTree[n - 1]-streetTree[0]) / gcd + 1 - (streetTree.length) + "\n");
    bw.flush();
    bw.close();
  }

  public static int findGCD(int a, int b){
    while(b != 0){
      int r = a % b;
      a = b;
      b = r;
    }

    return a;
  }
}