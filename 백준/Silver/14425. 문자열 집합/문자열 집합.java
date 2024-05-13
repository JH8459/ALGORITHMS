import java.io.*;
import java.util.*;

public class Main {
  /*
  * 트라이
  * Do it! 알고리즘 코딩 테스트 401.p
  */
  public static class Node {
    Node[] next = new Node[26];
    boolean isEnd;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    Node root = new Node();
    int result = 0;

    while (n > 0){
      String text = br.readLine();
      Node now = root;

      for(int i = 0; i < text.length(); i++){
        char ch = text.charAt(i);

        if(now.next[ch - 'a'] == null){
          now.next[ch - 'a'] = new Node();
        }

        now = now.next[ch - 'a'];

        if(i == text.length() - 1){
          now.isEnd = true;
        }
      }

      n--;
    }

    while (m > 0){
      String text = br.readLine();
      Node now = root;

      for(int i = 0; i < text.length(); i++){
        char ch = text.charAt(i);

        if(now.next[ch - 'a'] == null){
          break;
        }

        now = now.next[ch - 'a'];

        if(i == text.length() - 1 && now.isEnd){
          result++;
        }
      }

      m--;
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}