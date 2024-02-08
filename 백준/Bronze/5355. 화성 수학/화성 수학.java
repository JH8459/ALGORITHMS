import java.io.*;
import java.util.Objects;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++){
      String s = br.readLine();
      String[] sArr = s.split(" ");

      double result = Double.parseDouble(sArr[0]) ;

      for(int j = 1; j < sArr.length; j++){
        if(Objects.equals(sArr[j], "@")){
          result *= 3;
        } else if(Objects.equals(sArr[j], "%")){
          result += 5;
        } else {
          result -= 7;
        }
      }

      bw.write(String.format("%.2f", result) + "\n");
    }

    bw.flush();
    bw.close();
  }
}