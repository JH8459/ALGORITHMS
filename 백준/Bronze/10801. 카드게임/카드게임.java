import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st;
    int[] aScoreArr = new int[10];
    int[] bScoreArr = new int[10];
    int aScore = 0;
    int bScore = 0;

    st = new StringTokenizer(br.readLine());

    for(int i = 0; i < 10; i++){
      aScoreArr[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());

    for(int i = 0; i < 10; i++){
      bScoreArr[i] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0; i < 10; i++){
      if(aScoreArr[i] > bScoreArr[i]){
        aScore++;
      }else if(aScoreArr[i] < bScoreArr[i]){
        bScore++;
      }
    }

    if(aScore > bScore){
      bw.write("A\n");
    }else if(aScore < bScore){
      bw.write("B\n");
    }else{
      bw.write("D\n");
    }
    
    bw.flush();
    bw.close();
  }
}