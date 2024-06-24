import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] alphabetArr = new int[26];
    String word = br.readLine();

    for(int i = 0; i < word.length(); i++){
      alphabetArr[word.charAt(i) - 97] += 1;
    }

    for(int i = 0; i < 26; i++){
      bw.write(alphabetArr[i] + " ");
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }
}