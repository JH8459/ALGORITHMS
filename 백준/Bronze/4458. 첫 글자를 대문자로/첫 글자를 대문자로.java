import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0){
      String line = br.readLine();

      bw.write(Character.toUpperCase(line.charAt(0)) + line.substring(1) + "\n");
    }


    bw.flush();
    bw.close();
  }
}