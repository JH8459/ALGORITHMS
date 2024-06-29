import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();

    bw.write(ROT13(s));
    bw.flush();
    bw.close();
  }

  public static String ROT13 (String s){
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < s.length(); i++){
      int n = s.charAt(i);
      
      if((n <= 109 && n >= 97) || (n <= 77 && n >= 65)){
        char ch = (char) (s.charAt(i) + 13);
        sb.append(ch);
      } else if((n <= 122 && n > 109) || (n <= 90 && n > 77)) {
        char ch = (char) (s.charAt(i) + 13 - 26);
        sb.append(ch);
      } else {
        char ch = s.charAt(i);
        sb.append(ch);
      }
    }

    return sb.toString();
  }
}