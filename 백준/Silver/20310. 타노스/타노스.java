import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String s = br.readLine();
    char[] sArr = new char[s.length()];
    int zeroCnt = 0;
    int oneCnt = 0;

    for(int i = 0; i < s.length(); i++){
      sArr[i] = s.charAt(i);

      if (sArr[i] == '0') {
        zeroCnt++;
      } else {
        oneCnt++;
      }
    }

    zeroCnt /= 2;
    oneCnt /= 2;

    for(int i = 0; i < s.length() && oneCnt > 0; i++){
      // 1은 앞에서 부터 삭제, 삭제한 문자는 'D'로 치환한다.
      if(sArr[i] == '1'){
        oneCnt--;
        sArr[i] = 'D';
      }
    }

    for(int i = s.length() - 1; i > 0 && zeroCnt > 0; i--){
      // 0은 뒤에서 부터 삭제, 삭제한 문자는 'D'로 치환한다.
      if(sArr[i] == '0'){
        zeroCnt--;
        sArr[i] = 'D';
      }
    }

    for(int i = 0; i < s.length(); i++){
      if(sArr[i] != 'D'){
        sb.append(sArr[i]);
      }
    }

    bw.write(sb + "\n");
    bw.flush();
    bw.close();
  }
}