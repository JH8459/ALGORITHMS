import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] numArr = new int[101];
    int sum = 0;
    int frequentCnt = Integer.MIN_VALUE;
    int frequentNum = 0;

    for(int i = 1; i <= 10; i++){
      int num = Integer.parseInt(br.readLine());

      sum += num;
      numArr[num / 10] += 1;
    }

    for(int i = 0; i < numArr.length; i++){
      if(frequentCnt < numArr[i]){
        frequentCnt = numArr[i];
        frequentNum = i * 10;
      }
    }

    bw.write(sum / 10 + "\n" + frequentNum + "\n");
    bw.flush();
    bw.close();
  }
}