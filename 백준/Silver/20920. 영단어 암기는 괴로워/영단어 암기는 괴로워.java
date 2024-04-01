import java.io.*;
import java.util.*;

public class Main {
  public static class Node{
    String word;
    int count;
    private Node(String word, int count){
      this.word = word;
      this.count = count;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    Map<String, Integer> map = new HashMap<>();

    while(n-- > 0){
      String word = br.readLine();

      if(word.length() >= m) {
        if (map.containsKey(word)) {
          map.replace(word, map.get(word) + 1);
        } else {
          map.put(word, 1);
        }
      }
    }

    Node[] nodeArr = new Node[map.size()];
    int index = 0;

    for( Map.Entry<String, Integer> entry : map.entrySet() ){
      nodeArr[index++] = new Node(entry.getKey(), entry.getValue());
    }


    // 기준에 따른 정렬
    Arrays.sort(nodeArr, (a,b)->{
      if( a.count != b.count )
        return Integer.compare( b.count, a.count);
      else if( a.word.length() != b.word.length())
        return Integer.compare( b.word.length(), a.word.length());
      else
        return a.word.compareTo(b.word);
    });

    for(Node node : nodeArr){
      bw.write(node.word + "\n");
    }

    bw.flush();
    bw.close();
  }
}