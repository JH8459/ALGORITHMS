import java.io.*;
import java.util.Arrays;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 정렬 - 버블 정렬 => O(n^2)
     * Do to! 코딩 테스트 104.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 제한시간이 2초이므로 버블정렬 알고리즘은 사용 불가 => 정렬 전 / 후 idx 값을 비교하는 알고리즘 구현
    int n = Integer.parseInt(br.readLine()); // 배열의 크기 (1 ~ 500,000)
    int maxIdx = 0; // 최대 이동 수를 카운트할 변수 maxIdx 선언
    mDate[] mArr = new mDate[n];  // mData (value, idx) 객체로 구성된 배열 선언
    // 입력받은 수와 해당 입력받은 순서 idx로 mArr 초기화
    for (int i = 0; i < n; i++) {
      int mValue = Integer.parseInt(br.readLine());

      mArr[i] = new mDate(mValue, i);
    }
    // mArr 정렬
    Arrays.sort(mArr);
    // 정렬 전 idx: mArr[i].index & 정렬 후 idx: i
    for (int i = 0; i < n; i++) {
      if (maxIdx < mArr[i].index - i) {
        maxIdx = mArr[i].index - i;
      }
    }

    bw.write(maxIdx + 1 + "\n");

    bw.flush();
    bw.close();
  }

  // 객체 정렬
  static class mDate implements Comparable<mDate> {

    int value;
    int index;

    public mDate(int value, int index) {
      super();
      this.value = value;
      this.index = index;
    }

    @Override
    public int compareTo(mDate obj) {
      return this.value - obj.value;  // value 오름차순
    }
  }
}