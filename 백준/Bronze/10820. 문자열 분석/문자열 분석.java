import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s;
    while ((s = br.readLine()) != null) {
      int lowerCaseCnt = 0;
      int upperCaseCnt = 0;
      int numberCnt = 0;
      int spaceCnt = 0;

      for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (ch == ' ') spaceCnt++;
        if (Character.isUpperCase(ch)) upperCaseCnt++;
        if (Character.isLowerCase(ch)) lowerCaseCnt++;
        if (Character.isDigit(ch)) numberCnt++;
      }
      bw.write(lowerCaseCnt + " " + upperCaseCnt + " " + numberCnt + " " + spaceCnt + "\n");
    }

    bw.flush();
    bw.close();
  }
}