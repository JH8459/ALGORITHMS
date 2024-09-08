import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        bw.write("@@@@@");
      }

      bw.write("\n");
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        bw.write("@");
      }

      bw.write("\n");
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        bw.write("@@@@@");
      }

      bw.write("\n");
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        bw.write("@");
      }

      bw.write("\n");
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        bw.write("@");
      }

      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}