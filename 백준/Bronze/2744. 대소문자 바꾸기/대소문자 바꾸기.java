import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String word = br.readLine();
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < word.length(); i++){
      char character = word.charAt(i);

      if(Character.isUpperCase(character)){
        sb.append(Character.toLowerCase(character));
      } else {
        sb.append(Character.toUpperCase(character));
      }
    }

    bw.write(sb + "\n");
    bw.flush();
    bw.close();
  }
}