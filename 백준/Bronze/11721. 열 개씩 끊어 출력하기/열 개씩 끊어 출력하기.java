import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String word = br.readLine();
    int line = (int) Math.ceil((double) word.length() / 10);
    
    for(int i = 0; i < line; i++){
      bw.write(i == line - 1 ? word.substring(i * 10) : word.substring(i * 10, (i * 10) + 10) + "\n");
    }

    bw.flush();
    bw.close();
  }
}