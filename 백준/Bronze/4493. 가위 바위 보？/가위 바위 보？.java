import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0){
      int n = Integer.parseInt(br.readLine());
      int[] score = new int[2];

      for(int i = 0; i < n; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        String player1 = st.nextToken();
        String player2 = st.nextToken();

        if(Objects.equals(player1, "R")){
          if(Objects.equals(player2, "S")){
            score[0]++;
          } else if(Objects.equals(player2, "P")){
            score[1]++;
          }
        } else if(Objects.equals(player1, "S")){
          if(Objects.equals(player2, "R")){
            score[1]++;
          } else if(Objects.equals(player2, "P")){
            score[0]++;
          }
        } else {
          if(Objects.equals(player2, "R")){
            score[0]++;
          } else if(Objects.equals(player2, "S")){
            score[1]++;
          }
        }
      }

      if(score[0] > score[1]){
        bw.write("Player 1\n");
      } else if(score[0] < score[1]){
        bw.write("Player 2\n");
      } else {
        bw.write("TIE\n");
      }
    }

    bw.flush();
    bw.close();
  }
}