import java.io.*;
import java.util.*;

public class Main {
  public static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int r = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int size = (int) Math.pow(2, n);

    getXYPoint(size, r, c);

    bw.write( count + "\n");

    bw.flush();
    bw.close();
  }

  public static void getXYPoint(int size, int r, int c){
    if(size == 1){
      return;
    }

    if(r < size/2 && c < size/2) {
      getXYPoint(size/2, r, c);
    } else if(r < size/2 && c >= size/2) {
      count += size * size / 4;
      getXYPoint(size/2, r, c - size/2);
    } else if(r >= size/2 && c < size/2) {
      count += (size * size / 4) * 2;
      getXYPoint(size/2, r - size/2, c);
    } else {
      count += (size * size / 4) * 3;
      getXYPoint(size/2, r - size/2, c - size/2);
    }
  }
}