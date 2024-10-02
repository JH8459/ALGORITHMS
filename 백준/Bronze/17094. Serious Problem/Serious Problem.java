import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    long length = Integer.parseInt(br.readLine());
    String s = br.readLine();

    int numCnt = 0, charCnt = 0;

    for(int i = 0; i < length; i++){
      char ch = s.charAt(i);

      if(ch == '2') {
        numCnt++;
      } else {
        charCnt++;
      }
    }

    if(numCnt > charCnt){
      bw.write("2\n");
    } else if(numCnt < charCnt){
      bw.write("e\n");
    } else {
      bw.write("yee\n");
    }

    bw.flush();
    bw.close();
  }
}