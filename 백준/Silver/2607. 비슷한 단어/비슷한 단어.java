import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String standard = br.readLine();
    int result = 0;

    while (n-- > 1){
      String word = br.readLine();

      int sameWordCnt = 0;
      int[] wordArr = new int[26];

      for(int j = 0; j < standard.length(); j++) {
        wordArr[standard.charAt(j) - 'A']++;
      }

      for(int j = 0; j < word.length(); j++) {
        if(wordArr[word.charAt(j) - 'A'] > 0) {
          sameWordCnt++;
          wordArr[word.charAt(j) - 'A'] -= 1;
        }
      }

      if(standard.length() == word.length() && (standard.length() == sameWordCnt || standard.length() - 1 == sameWordCnt)) {
        result++;
      }
      else if (standard.length() == word.length() - 1 && word.length() - 1 == sameWordCnt) {
        result++;
      }
      else if (standard.length() == word.length() + 1 && word.length() == sameWordCnt) {
        result++;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}