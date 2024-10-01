import java.io.*;
import java.util.Objects;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();

    if(Objects.equals(s, "N") || Objects.equals(s, "n")){
      bw.write("Naver D2\n");
    } else {
      bw.write("Naver Whale\n");
    }
    
    bw.flush();
    bw.close();
  }
}