import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder result = new StringBuilder();

    for (int i = 1; i <= 5; i++) {
      if (br.readLine().contains("FBI")) {
        result.append(i).append(" ");
      }
    }

    if(!result.isEmpty()){
      bw.write(result + "\n");
    } else {
      bw.write("HE GOT AWAY!\n");
    }

    bw.flush();
    bw.close();
  }
}