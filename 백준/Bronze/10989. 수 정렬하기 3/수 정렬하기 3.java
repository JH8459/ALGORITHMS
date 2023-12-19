import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static int[] nArr;

  public static void main(String args[]) throws IOException {
    /*
     * 정렬 - 기수 정렬 => O(kn)  // k는 데이터 자릿수 (시간복잡도가 가장 짧은 정렬 방식)
     * Do to! 코딩 테스트 139.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine()); // n (1 ~ 10,000,000) => n의 범위가 넓으므로 기수 정렬 알고리즘 필요
    int maxNumber = 10000;  // 최대값 10,000
    nArr = new int[n];

    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(br.readLine());
    }

    radixSort(nArr, maxNumber); // 병합 정렬 수행

    for (int i = 0; i < n; i++) {
      bw.write(nArr[i] + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static void radixSort(int[] arr, int maxNumber) {
    int[] output = new int[arr.length];  // 임시 정렬 배열
    int digits = 1; //현재 자리수
    // 최대수만큼 반복
    while (digits <= maxNumber) {
      int[] bucket = new int[10]; // 자리수들의 분포를 합 배열의 형태로 알려주는 배열

      for (int i = 0; i < arr.length; i++) {
        bucket[(arr[i] / digits) % 10]++;
      }

      for (int i = 1; i < 10; i++) {
        bucket[i] += bucket[i - 1];
      }

      for (int i = arr.length - 1; i >= 0; i--) {
        output[bucket[((arr[i] / digits) % 10)] - 1] = arr[i];
        bucket[(arr[i] / digits) % 10]--;
      }

      for (int i = 0; i < arr.length; i++) {
        nArr[i] = output[i];
      }

      digits *= 10; // 자리수 증가
    }
  }
}