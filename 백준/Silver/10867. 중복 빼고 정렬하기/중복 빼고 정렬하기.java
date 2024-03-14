import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    HashSet<Integer> hashSet = new HashSet<Integer>();  // 중복 X

    int cnt = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i=0; i < cnt; i++){
      hashSet.add(Integer.parseInt(st.nextToken()));
    }

    ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
    Collections.sort(arrayList);

    for(int num : arrayList){
      bw.write(num + " ");
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }
}