import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    if(n % 2 == 1){
      bw.write("SK\n");
    } else {
      bw.write("CY\n");
    }
    
    bw.flush();
    bw.close();
  }
}