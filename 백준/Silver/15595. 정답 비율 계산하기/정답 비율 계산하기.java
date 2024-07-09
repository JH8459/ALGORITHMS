import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int answer = 0;
    int total = 0;
    HashMap<String,Integer> map = new HashMap<>();

    for(int i = 0; i < n; i++){
      String[] sArr = br.readLine().split(" ");

      String userId = sArr[1];
      int result = Integer.parseInt(sArr[2]);

      if(!userId.equals("megalusion")){
        Integer userCnt = map.get(userId);

        if(userCnt == null){
          userCnt = 0;
        } else if (userCnt < 0) {
          continue;
        }

        userCnt += 1;

        if(result == 4){
          answer += 1;
          total += userCnt;
          userCnt *= -1;
        }

        map.put(userId, userCnt);
      }
    }

    double result = total > 0 ? (double) answer / total * 100 : 0;

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}