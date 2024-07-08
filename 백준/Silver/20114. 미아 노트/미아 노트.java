import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());

    String[] damagedStringArr = new String[h];

    for(int i = 0; i < h; i++){
      damagedStringArr[i] = br.readLine();
    }

    StringBuilder sb = new StringBuilder();

    for(int i = 1; i <= n; i++){
      boolean isUnknown = true;

      for(int j = 0; j < h; j++){
        for(int k = (i - 1) * w; k < i * w; k++){
          if(damagedStringArr[j].charAt(k) != '?'){
            isUnknown = false;
            sb.append(damagedStringArr[j].charAt(k));
            break;
          }
        }

        if(!isUnknown){
          break;
        }
      }

      if(isUnknown){
        sb.append("?");
      }
    }

    bw.write(sb + "\n");
    bw.flush();
    bw.close();
  }
}