import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static int[] nArr; // 정렬할 배열
  public static int[] tempArr;  // 병합 정렬시 사용할 임시 배열
  public static long result;  // index가 이동한 거리

  public static void main(String args[]) throws IOException {
    /*
     * 정렬 - 병합 정렬 => O(nLogn)
     * Do to! 코딩 테스트 133.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine()); // n (1 ~ 500,000)
    nArr = new int[n + 1];
    tempArr = new int[n + 1];
    result = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 1; i <= n; i++) {
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    mergeSort(1, n); // 병합 정렬 수행

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }

  public static void mergeSort(int start, int end) {
    // 재귀 탈출 조건
    if (end - start < 1) {
      return;
    }

    int middle = start + (end - start) / 2;

    mergeSort(start, middle);
    mergeSort(middle + 1, end);

    for (int i = start; i <= end; i++) {
      tempArr[i] = nArr[i];
    }

    int k = start;
    int index1 = start; // 좌측 그룹
    int index2 = middle + 1;  // 우측 그룹
    // 분리된 두 그룹을 병합하는 과정
    while (index1 <= middle && index2 <= end) {
      // 좌측 그룹 index1과 우측 그룹 index2이 가르키는 값 비교하여 더 작은 수를 임시 정렬 배열(tempArr)에 저장하고 해당 index값을 1 추가한다.
      if (tempArr[index1] > tempArr[index2]) {
        nArr[k] = tempArr[index2];
        result = result + index2 - k; // 뒤 그룹 데이터가 작은 경우 result값 증가
        k++;
        index2++;
      } else {
        nArr[k] = tempArr[index1];
        k++;
        index1++;
      }
    }
    // 한쪽 그룹 정렬이 끝난 뒤 나머지 그룹 정렬
    while (index1 <= middle) {
      nArr[k] = tempArr[index1];
      k++;
      index1++;
    }

    while (index2 <= end) {
      nArr[k] = tempArr[index2];
      k++;
      index2++;
    }
  }
}