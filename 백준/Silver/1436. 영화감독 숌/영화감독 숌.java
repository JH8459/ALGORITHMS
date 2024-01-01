import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int movieTitle = 666;  // 영화 제목
    int movieSeriesNum = 1;  // 영화 시리즈 순서

    while (n != movieSeriesNum) {  // 입력받은 n과 시리즈 순번이 같아질 때까지 반복
      movieTitle++;

      if (String.valueOf(movieTitle).contains("666")) {
        movieSeriesNum++;
      }
    }

    bw.write(movieTitle + "\n");
    bw.flush();
    bw.close();
  }
}