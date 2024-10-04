import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0){
      String s = br.readLine();

      for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '+'){
          int a = Integer.parseInt(s.substring(0, i));
          int b = Integer.parseInt(s.substring(i + 1));

          bw.write(a + b + "\n");
        } else if(s.charAt(i) == '='){
          bw.write("skipped\n");
          break;
        }
      }
    }

    bw.flush();
    bw.close();
  }
}