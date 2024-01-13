import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int result = 0;

    for(int i = 0; i < n; i++){
      int num = i;
      int digitSum = 0; // 자리수 합

      while (num != 0){
        digitSum += num % 10; // 각 자리수를 더한다
        num /= 10;
      }

      if (digitSum + i == n){ // 각 자리수의 합 + 현재 번호의 합이 입력한 자연수와 같다면 생성자 확인
        result = i;
        break;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}