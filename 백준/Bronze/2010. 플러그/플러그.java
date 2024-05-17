import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int result = 0;

    for(int i = 0; i < n; i++){
      int plug = Integer.parseInt(br.readLine());

      result += plug;

      if(i != n - 1){
        result -= 1;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}