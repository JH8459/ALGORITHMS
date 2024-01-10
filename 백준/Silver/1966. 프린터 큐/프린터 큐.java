import java.io.*;
import java.util.*;

public class Main {
  public static class Document{
    int documentNum;
    int documentValue;

    public Document (int documentNum, int documentValue){
      this.documentNum = documentNum;
      this.documentValue = documentValue;
    }
  }
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int testCase = Integer.parseInt(st.nextToken());  // 테스트케이스의 수

    for(int test = 0; test < testCase; test++){
      st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken()); // 문서의 개수
      int m = Integer.parseInt(st.nextToken()); // 출력 순서를 출력 할 문서

      Queue<Document> queue = new LinkedList<>();  // 문서의 중요도를 담을 큐

      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < n; i++){
        queue.offer(new Document(i, Integer.parseInt(st.nextToken())));  // 문서의 정보를 큐에 삽입
      }

      int cnt = 0;  // 출력 순서를 저장할 변수

      while (!queue.isEmpty()){
        boolean isSkip = false; // 출력 여부 판별 변수
        Document frontDocument = queue.poll();  // 큐의 맨 앞 문서 정보를 뺀다

        for(Document document: queue){  // 큐의 맨 앞 문서보다 더 우선 순위 출력 대상이 존재하는지 찾는 로직
          if(document.documentValue > frontDocument.documentValue){
            isSkip = true;
            queue.offer(frontDocument);
            break;
          }
        }

        if(!isSkip){  // 문서 출력 순위가 가장 높다면 출력
          cnt++;

          if(frontDocument.documentNum == m){ // 출력한 문서의 번호가 찾고자 하는 문서 번호라면 반복문 종료
            bw.write(cnt + "\n");
            break;
          }
        }
      }
    }

    bw.flush();
    bw.close();
  }
}