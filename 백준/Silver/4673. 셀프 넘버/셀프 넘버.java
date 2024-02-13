import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    boolean[] check = new boolean[10001];

    for(int i = 1; i <= 10000; i++){
      int n = d(i);

      if(n <= 10000){
        check[n] = true;
      }
    }

    for(int i = 1; i <= 10000; i++){
      if(!check[i]){  // 생성자가 없는 숫자만 출력
        bw.write(i + "\n");
      }
    }

    bw.flush();
    bw.close();
  }

  public static int d(int number){  // n과 n의 각 자리수를 더하는 함수
    int sum = number;

    while (number != 0){
      sum += number % 10; // 각 자리수 합산

      number /= 10;
    }

    return sum;
  }
}