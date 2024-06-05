import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    for(int i = 0 ; i < testCase; i++) {
      int n = Integer.parseInt(br.readLine());

      String binary = Integer.toBinaryString(n);

      for(int j = binary.length() - 1; j >= 0; j--){
        if(binary.charAt(j) == '1'){
          bw.write(Math.abs(binary.length() - 1 - j) + " ");
        }
      }

      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}