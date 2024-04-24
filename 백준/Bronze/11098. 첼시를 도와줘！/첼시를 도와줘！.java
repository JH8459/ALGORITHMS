import java.io.*;
import java.util.*;

public class Main {
  public static class Player {
    private int price;
    private String name;

    public Player (int price, String name){
      this.price = price;
      this.name = name;
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    while (testCase-- > 0){
      int p = Integer.parseInt(br.readLine());
      Player[] pArr = new Player[p];

      for(int i = 0; i < p; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());

        pArr[i] = new Player(Integer.parseInt(st.nextToken()), st.nextToken());
      }

      Arrays.sort(pArr, Comparator.comparingInt(player -> player.price));

      bw.write(pArr[pArr.length - 1].name + "\n");
    }

    bw.flush();
    bw.close();
  }
}