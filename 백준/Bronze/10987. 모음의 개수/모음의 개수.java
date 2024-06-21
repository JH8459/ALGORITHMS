import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String word = br.readLine();
    int result = 0;

    for(int i = 0; i < word.length(); i++){
      char ch = word.charAt(i);

      if(isCheckAlphabet(ch)){
        result += 1;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }

  public static boolean isCheckAlphabet (char ch) {
      return switch (ch) {
        case 'a', 'e', 'i', 'o', 'u' -> true;
        default -> false;
      };
  }
}