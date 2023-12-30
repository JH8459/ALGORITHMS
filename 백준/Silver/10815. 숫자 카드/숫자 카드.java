import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 숫자 카드의 개수
    long[] cardArr = new long[n];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      cardArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(cardArr);

    st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken()); // 구해야 할 카드의 개수

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      int target = Integer.parseInt(st.nextToken());  // 찾아야 할 숫자 카드

      int start = 0;
      int end = n - 1;
      boolean isExistCard = false;

      while (start <= end) {
        int middle = (start + end) / 2;

        if (cardArr[middle] < target) {
          start = middle + 1;
        } else if (cardArr[middle] > target) {
          end = middle - 1;
        } else {
          isExistCard = true;
          break;
        }
      }

      if (isExistCard) {
        bw.write("1 ");
      } else {
        bw.write("0 ");
      }
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }
}