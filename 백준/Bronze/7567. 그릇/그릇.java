import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String dishes = br.readLine();
    char prevDish = dishes.charAt(0);
    int result = 10;  // 첫번쨰 접시의 높이는 무조건 10이다.

    for(int i = 1; i < dishes.length(); i++){
      char nowDish = dishes.charAt(i);

      if(prevDish == nowDish){
        result += 5;  // 직전 접시와 현재 접시의 모양이 같다면 + 5 / 다르다면 + 10
      } else {
        result += 10;
      }

      prevDish = nowDish;
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}