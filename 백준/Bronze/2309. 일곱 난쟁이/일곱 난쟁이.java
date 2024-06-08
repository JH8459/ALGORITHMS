import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] heightArr = new int[9];
    int heightSum = 0;

    for(int i = 0; i < 9; i++){
      int height = Integer.parseInt(br.readLine());

      heightArr[i] = height;
      heightSum += height;
    }

    Arrays.sort(heightArr);

    int targetA = 0;
    int targetB = 0;

    for(int i = 0; i < 8; i++){
      for(int j = i + 1; j < 9; j++){
        if(heightSum - heightArr[i] - heightArr[j] == 100){
          targetA = i;
          targetB = j;
          break;
        }
      }
    }

    for(int i = 0; i < 9; i++) {
      if(i != targetA && i != targetB) {
        bw.write(heightArr[i] + "\n");
      }
    }

    bw.flush();
    bw.close();
  }
}