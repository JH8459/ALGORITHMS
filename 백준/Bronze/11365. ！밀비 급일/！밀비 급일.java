import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String line = br.readLine();

      if(Objects.equals(line, "END")){
        break;
      }

      bw.write(RevertString(line) + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static String RevertString (String line){
    StringBuilder sb = new StringBuilder();

    for(int i = line.length() - 1; i >= 0; i--){
      sb.append(line.charAt(i));
    }

    return sb.toString();
  }
}