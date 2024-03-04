import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());

    int yesCnt = 0;
    int noCnt = 0;

    for(int i = 0; i < num; i++){
      int answer = Integer.parseInt(br.readLine());

      if (answer == 1){
        yesCnt++;
      } else {
        noCnt++;
      }
    }

    bw.write(yesCnt > noCnt ? "Junhee is cute!\n" : "Junhee is not cute!\n");
    bw.flush();
    bw.close();
  }
}