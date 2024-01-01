import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String[] sArr = new String[n];

    for (int i = 0; i < n; i++) {
      sArr[i] = br.readLine();
    }

    Arrays.sort(sArr, (String s1, String s2) -> {
      if (s1.length() == s2.length()) {
        return s1.compareTo(s2);  // 길이가 같으면 사전 순으로 정렬
      } else {
        return Integer.compare(s1.length(), s2.length()); // 길이가 같지 않다면 길이 순으로 정렬
      }
    });

    sArr = Arrays.stream(sArr).distinct().toArray(String[]::new); // Array => Stream 변환 후 distinct() 중복 제거 => Array 재 변환

    for (String s : sArr) {
      bw.write(s + "\n");
    }

    bw.flush();
    bw.close();
  }
}