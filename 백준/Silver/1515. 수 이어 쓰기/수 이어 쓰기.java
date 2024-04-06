import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String n = br.readLine();
    int i = 0;

    while(true) {
      i++;
      String num = Integer.toString(i);

      while(!num.isEmpty() && !n.isEmpty()) {
        if(num.charAt(0) == n.charAt(0)) {
          n = n.substring(1);
        }

        num = num.substring(1);
      }

      if(n.isEmpty()) {
        bw.write(i + "\n");
        break;
      }

    }

    bw.flush();
    bw.close();
  }
}