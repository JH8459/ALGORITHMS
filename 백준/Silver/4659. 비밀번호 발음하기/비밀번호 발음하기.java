import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    while (true){
      String st = br.readLine();

      if(Objects.equals(st, "end")){
        break;
      }

      char[] charArr = st.toCharArray();

      boolean condition1 = isCheckCondition1(charArr);  // 모음을 포함하는지 판별
      boolean condition2 = isCheckCondition2(charArr);  // 자음 or 모음이 3개 연속으로 존재하는지 판별
      boolean condition3 = isCheckCondition3(charArr);  // 같은 글자가 연속적으로 두번 오는지 판별

      sb.append('<').append(st).append('>').append(" is ");

      if(condition1 && condition2 && condition3){
        sb.append("acceptable.\n");
      } else {
        sb.append("not acceptable.\n");
      }
    }

    bw.write(String.valueOf(sb));
    bw.flush();
    bw.close();
  }

  public static boolean isCheckCondition1 (char[] charArr) {
    for (char ch : charArr) {
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        return true;
      }
    }

    return false;
  }

  public static boolean isCheckCondition2 (char[] charArr) {
    for(int i = 1; i < charArr.length - 1; i++){
      char beforeCh = charArr[i - 1];
      char nowCh = charArr[i];
      char nextCh = charArr[i + 1];

      if ((beforeCh == 'a' || beforeCh == 'e' || beforeCh == 'i' || beforeCh == 'o' || beforeCh == 'u')
          && (nowCh == 'a' || nowCh == 'e' || nowCh == 'i' || nowCh == 'o' || nowCh == 'u')
          && (nextCh == 'a' || nextCh == 'e' || nextCh == 'i' || nextCh == 'o' || nextCh == 'u')) {
        return false;
      }

      if ((beforeCh != 'a' && beforeCh != 'e' && beforeCh != 'i' && beforeCh != 'o' && beforeCh != 'u')
          && (nowCh != 'a' && nowCh != 'e' && nowCh != 'i' && nowCh != 'o' && nowCh != 'u')
          && (nextCh != 'a' && nextCh != 'e' && nextCh != 'i' && nextCh != 'o' && nextCh != 'u')) {
        return false;
      }
    }

    return true;
  }

  public static boolean isCheckCondition3 (char[] charArr) {
    for(int i = 0; i < charArr.length - 1; i++){
      char nowCh = charArr[i];
      char nextCh = charArr[i + 1];

      if (nowCh == nextCh) {
        if(nowCh != 'e' && nowCh != 'o'){
          return false;
        }
      }
    }

    return true;
  }
}