import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true){
      String line = br.readLine();

      if(Objects.equals(line, "EOI")){
        break;
      }

      if(line.toLowerCase().contains("nemo")){
        bw.write("Found\n");
      } else {
        bw.write("Missing\n");
      }
    }

    bw.flush();
    bw.close();
  }
}