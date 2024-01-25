import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    /*
     * 정수론 - 소수
     * Do to! 코딩 테스트 223.p
     */
    Scanner sc = new Scanner(System.in);

    long min = sc.nextLong();
    long max = sc.nextLong();
    int result = 0;

    long[] numArr = new long[(int) Math.ceil(Math.sqrt(max)) + 1];

    for(int i = 2; i < numArr.length; i++) {
      numArr[i]= i;
    }

    for(int i = 2; i < Math.sqrt(max); i++){
      for(int j = 2 * i; j < numArr.length; j = j + i){
        if(numArr[j] == 0){
          continue;
        }

        numArr[j] = 0;
      }
    }

    for(int i = 2; i <= Math.sqrt(max); i++) {
      for(int square = 2; square <= Math.log(max) / Math.log(i); square++) {
        if(numArr[i] != 0) {
          long num = (long)Math.pow(i,square);
          if(num >= min && num <= max) {
            result++;
          }
        }
      }
    }

    System.out.println(result);
  }
}