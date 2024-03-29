import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    for(int testCase = 0; testCase < t; testCase++){
      int n = Integer.parseInt(br.readLine());
      int[] rankList = new int[n];
      Map<Integer, Integer> result = new HashMap<>();

      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i = 0; i < n; i++){
        int teamNum = Integer.parseInt(st.nextToken());
        result.put(teamNum, result.getOrDefault(teamNum, 0) + 1);
        rankList[i] = teamNum;
      }

      int[] fifthGoalIdx = new int[result.size() + 1];
      Map<Integer, Integer> scoreMap = new HashMap<>();
      Map<Integer, Integer> tempMap = new HashMap<>();
      int score = 1;

      for (int rank: rankList){
        if (result.get(rank) >= 6){
          tempMap.put(rank, tempMap.getOrDefault(rank, 0) + 1);

          if (tempMap.get(rank) <= 4){
            scoreMap.put(rank, scoreMap.getOrDefault(rank, 0) + score);
          }

          if (tempMap.get(rank) == 5){
            fifthGoalIdx[rank] = score;
          }
          score++;
        }
      }

      List<Integer> keyData = new ArrayList<>(scoreMap.keySet());
      keyData.sort((x, y) -> {
        if (Objects.equals(scoreMap.get(x), scoreMap.get(y))){
          return fifthGoalIdx[x] - fifthGoalIdx[y];
        } else{
          return scoreMap.get(x) - scoreMap.get(y);
        }
      });

      bw.write(keyData.get(0) + "\n");
    }

    bw.flush();
    bw.close();
  }
}