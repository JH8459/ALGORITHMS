import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = 1;

    while (true){
      String line = br.readLine();
      n++;

      if(Objects.equals(line, "Was it a cat I saw?")){
        break;
      }

      bw.write(getDecodedString(n, line) + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static String getDecodedString(int n, String line){
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < line.length(); i += n){
      sb.append(line.charAt(i));
    }

    return sb.toString();
  }
}