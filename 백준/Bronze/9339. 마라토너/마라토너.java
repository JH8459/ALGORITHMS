import java.io.*;
import java.util.*;

public class Main {
  public static class Player {
    int num;
    int score;

    private Player (int num, int score){
      this.num = num;
      this.score = score;
    }

    private void setScore (int score) {
      this.score = score;
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0){
      int k = Integer.parseInt(br.readLine());
      ArrayList<Player> players = new ArrayList<Player>();
      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int i = 0; i < k; i++){
        players.add(new Player(Integer.parseInt(st.nextToken()), 0));
      }

      int n = Integer.parseInt(br.readLine());
      int maxNum = 0, minScore = Integer.MAX_VALUE, cnt = 0;

      for(int i = 0; i < n; i++){
        st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int hours = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        for(Player player: players){
          if(player.num == num && hours > 0){
            int score = hours * 60 + minutes;
            player.setScore(score);

            if(score < minScore){
              maxNum = player.num;
              minScore = player.score;
            }

            if(score <= 360){
              cnt++;
            }
          }
        }
      }

      bw.write(maxNum + " " + cnt + "\n");
    }

    bw.flush();
    bw.close();
  }
}