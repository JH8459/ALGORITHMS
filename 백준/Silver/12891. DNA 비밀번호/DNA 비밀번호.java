import java.io.*;
import java.util.*;

public class Main {

  static int[] checkArr; // 비밀번호 체크 배열 "A", "C", "G", "T"
  static int[] myArr;
  static int checkPassword;

  public static void main(String args[]) throws IOException {
    /*
     * 슬라이딩 윈도우
     * Do to! 코딩 테스트 67.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int s = Integer.parseInt(st.nextToken()); // 문자열 길이
    int p = Integer.parseInt(st.nextToken()); // 부분 문자열 길이
    int result = 0;

    char[] ch = new char[s];
    checkArr = new int[4];
    myArr = new int[4];
    checkPassword = 0;

    ch = (br.readLine().toCharArray()); // DNA 문자열

    st = new StringTokenizer(br.readLine());  // 부분 문자열에 포함되어야 할 최소 개수

    for (int i = 0; i < 4; i++) {
      checkArr[i] = Integer.parseInt(st.nextToken());

      if (checkArr[i] == 0) {
        checkPassword++;
      }
    }

    for (int i = 0; i < p; i++) { // 초기 P 문자열 처리
      AddMyArr(ch[i]);
    }

    if (checkPassword == 4) {
      result++;
    }

    for (int i = p; i < s; i++) { // 슬라이딩 문자열 처리
      int j = i - p;

      AddMyArr(ch[i]);
      RemoveMyArr(ch[j]);

      if (checkPassword == 4) {
        result++;
      }
    }

    bw.write(result + "\n");

    bw.flush();
  }

  private static void AddMyArr(char ch) {
    switch (ch) {
      case 'A':
        myArr[0]++;

        if (myArr[0] == checkArr[0]) {
          checkPassword++;
        }

        break;
      case 'C':
        myArr[1]++;

        if (myArr[1] == checkArr[1]) {
          checkPassword++;
        }

        break;
      case 'G':
        myArr[2]++;

        if (myArr[2] == checkArr[2]) {
          checkPassword++;
        }

        break;
      case 'T':
        myArr[3]++;

        if (myArr[3] == checkArr[3]) {
          checkPassword++;
        }

        break;
      default:
        break;
    }
  }

  private static void RemoveMyArr(char ch) {
    switch (ch) {
      case 'A':
        if (myArr[0] == checkArr[0]) {
          checkPassword--;
        }

        myArr[0]--;

        break;
      case 'C':
        if (myArr[1] == checkArr[1]) {
          checkPassword--;
        }

        myArr[1]--;

        break;
      case 'G':
        if (myArr[2] == checkArr[2]) {
          checkPassword--;
        }

        myArr[2]--;

        break;
      case 'T':
        if (myArr[3] == checkArr[3]) {
          checkPassword--;
        }

        myArr[3]--;

        break;
      default:
        break;
    }
  }
}