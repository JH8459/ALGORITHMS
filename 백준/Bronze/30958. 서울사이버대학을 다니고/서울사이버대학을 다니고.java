import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] alphabet = new int[26];
    int n = Integer.parseInt(br.readLine());
    int max = Integer.MIN_VALUE;
    String s = br.readLine();

    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) - 97 >= 0 && s.charAt(i) - 97 <= 26) {
        alphabet[s.charAt(i) - 97]++;
      }
    }

    for (int j : alphabet) {
      max = Math.max(max, j);
    }

    bw.write(max + "\n");
    bw.flush();
    bw.close();
  }
}