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
      boolean isVowel;

      switch (ch){
        case 'a':
          isVowel = true;
          break;
        case 'e':
          isVowel = true;
          break;
        case 'i':
          isVowel = true;
          break;
        case 'o':
          isVowel = true;
          break;
        case 'u':
          isVowel = true;
          break;
        default:
          isVowel = false;
          break;
      }

    return isVowel;
  }
}