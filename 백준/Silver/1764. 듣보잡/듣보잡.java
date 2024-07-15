import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    HashSet<String> nSet = new HashSet<>();
    ArrayList<String> mList = new ArrayList<>();

    // nSet에 n개의 입력을 담는다.
    for (int i = 0; i < n; i++) {
      nSet.add(br.readLine());
    }

    // mList는 nSet의 포함여부에 따라 m개 중 일부의 입력을 담는다.
    for (int i = 0; i < m; i++) {
      String s = br.readLine();

      if(nSet.contains(s)){
        mList.add(s);
      }
    }

    // 사전순으로 정렬
    Collections.sort(mList);

    // 순차 출력
    bw.write(mList.size() + "\n");

    for (String s : mList) {
      bw.write(s + "\n");
    }

    bw.flush();
    bw.close();
  }
}