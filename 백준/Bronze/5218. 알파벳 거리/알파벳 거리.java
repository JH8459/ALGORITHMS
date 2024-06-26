import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int tc = Integer.parseInt(br.readLine());

    while (tc-- > 0){
      StringTokenizer st = new StringTokenizer(br.readLine());

      String word1 = st.nextToken();
      String word2 = st.nextToken();
      int[] distanceArr = new int[word1.length()];

      for(int i = 0; i < word1.length(); i++){
        distanceArr[i] = getDistance(word2.charAt(i), word1.charAt(i));
      }

      bw.write("Distances: ");

      for (int i : distanceArr) {
        bw.write(i + " ");
      }

      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }

  public static int getDistance(char a, char b){
    if(a >= b){
      return a - b;
    } else {
      return (a + 26) - b;
    }
  }
}