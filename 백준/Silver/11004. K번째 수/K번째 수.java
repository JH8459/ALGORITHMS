import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 정렬 - 퀵 정렬 => O(nLogn)
     * Do to! 코딩 테스트 121.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());  // n (1 ~ 5,000,000)
    int k = Integer.parseInt(st.nextToken());  // k (1 ~ n)
    int[] nArr = new int[n];

    st = new StringTokenizer(br.readLine());  // A1 ~ An

    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(st.nextToken());
    }
    // 삽입 정렬
    quickSort(nArr, 0, n - 1, k - 1);

    bw.write(nArr[k - 1] + "\n");
    bw.flush();
    bw.close();
  }

  public static void quickSort(final int[] nArr, final int start, final int end, final int k) {
    if (start < end) {
      int pivot = getPivot(nArr, start, end);

      if (pivot == k) {
        // k번쨰 수가 pivot이면 연산 불필요
        return;
      } else if (pivot > k) {
        // k가 pivot보다 작으면 왼쪽 그룹(pivot 기준) 정렬 수행
        quickSort(nArr, start, pivot - 1, k);
      } else {
        // k가 pivot보다 크면 오른쪽 그룹(pivot 기준) 정렬 수행
        quickSort(nArr, pivot + 1, end, k);
      }
    }
  }

  public static int getPivot(final int[] nArr, final int start, final int end) {
    if (start + 1 == end) {
      if (nArr[start] > nArr[end]) {
        swap(nArr, start, end);
      }

      return end;
    }

    int middle = (start + end) / 2;

    swap(nArr, start, middle);  // 중앙값을 start와 교체

    int pivot = nArr[start];
    // 반복문 기준값
    int i = start + 1;
    int j = end;

    while (i <= j) {
      while (j >= start + 1 && pivot < nArr[j]) {
        // pivot보다 작은 수가 나올 때까지 j--
        j--;
      }
      while (i <= end && pivot > nArr[i]) {
        // pivot보다 큰 수가 나올 때까지 i++
        i++;
      }
      if (i <= j) {
        swap(nArr, i++, j--);
      }
    }

    nArr[start] = nArr[j];
    nArr[j] = pivot;

    return j;
  }

  public static void swap(int[] nArr, final int i, final int j) {
    int temp = nArr[i];
    nArr[i] = nArr[j];
    nArr[j] = temp;
  }
}