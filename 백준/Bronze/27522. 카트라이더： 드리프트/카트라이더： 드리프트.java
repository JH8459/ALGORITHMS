import java.io.*;
import java.util.*;

public class Main {
  public static class Racer {
    String team;
    float second;

    private Racer (String team, float second){
      this.team = team;
      this.second = second;
    }

    private float getSecond () {
      return this.second;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Racer[] racers = new Racer[8];
    int redScore = 0, blueScore = 0;

    for(int i = 0; i < 8; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      String time = st.nextToken();
      String team = st.nextToken();

      st = new StringTokenizer(time, ":");

      int m = Integer.parseInt(st.nextToken());
      int s = Integer.parseInt(st.nextToken());
      float ss = (float) Integer.parseInt(st.nextToken()) / 1000;

      racers[i] = new Racer(team,60 * m + s + ss);
    }

    Arrays.sort(racers, new Comparator<Racer>() {
      @Override
      public int compare(Racer racer1, Racer racer2) {
        return Float.compare(racer1.getSecond(), racer2.getSecond());
      }
    });

    for(int i = 0; i < 8; i++){
      int[] scores = { 10, 8, 6, 5, 4, 3, 2, 1, 0 };
      Racer racer = racers[i];

      if(Objects.equals(racer.team, "R")){
        redScore += scores[i];
      } else {
        blueScore += scores[i];
      }
    }

    if(redScore > blueScore){
      bw.write("Red\n");
    } else {
      bw.write("Blue\n");
    }

    bw.flush();
    bw.close();
  }
}