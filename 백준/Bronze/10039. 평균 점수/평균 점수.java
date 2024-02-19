import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int result = 0;

    for(int i = 0; i < 5; i ++){
      int score = Integer.parseInt(br.readLine());

      if(score < 40){
        score = 40;
      }

      result += score;
    }

    bw.write(result / 5 + "\n");
    bw.flush();
    bw.close();
  }
}