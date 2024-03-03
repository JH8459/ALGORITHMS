import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int a = 0;
    int b = 0;

    int judgeCnt = Integer.parseInt(br.readLine());
    String str = br.readLine();

    for(int j = 0; j < str.length(); j++){
      char ch = str.charAt(j);

      switch (ch) {
        case 'A':
          a++;
          break;
        case 'B':
          b++;
          break;
        default:
          break;
      }
    }


    if (a > b){
      bw.write("A\n");
    } else if (a < b){
      bw.write("B\n");
    } else {
      bw.write("Tie\n");
    }

    bw.flush();
    bw.close();
  }
}