import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true){
      // 입력 문자열 s, HashSet 변수 선언
      String s = br.readLine();
      HashSet<String> hashSet = new HashSet<>();
      // "0"이 나올때 까지 반복 수행
      if(s.equals("0")){
        break;
      }
      // hashSet에 존재하지 않는다면 담고, 존재하면 hashSet의 size를 리턴 후 반복문을 탈출한다.
      while (!hashSet.contains(s)){
        hashSet.add(s);

        // s^2
        long square = Long.parseLong(s) * Long.parseLong(s);
        // s^2 => 문자열로 치환
        StringBuilder convert = new StringBuilder(String.valueOf(square));
        // 8자리가 될때까지 "0"을 앞에 붙인다
        while (convert.length() < 8){
          convert.insert(0, "0");
        }
        // s를 변경 후 반복 수행
        s = convert.substring(2, 6);
      }
      // hashSet의 사이즈를 출력
      bw.write(hashSet.size() + "\n");
    }

    bw.flush();
    bw.close();
  }
}