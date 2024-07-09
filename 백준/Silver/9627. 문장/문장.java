import java.io.*;

public class Main {
  private static final String[] ONE = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
  private static final String[][] TEN = {
      {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"},
      {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}
  };

  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < n; i++){
      String s = br.readLine();
      sb.append(s).append(" ");
    }

    String word = sb.toString().trim();

    bw.write(solve(word));
    bw.flush();
    bw.close();
  }

  private static String solve(String word) {
    String strNum;
    int len = word.replaceAll(" ", "").length() - 1;

    for(int i = 1; i < 1000; i++)
      if((strNum = getStr(i)).length() + len == i){
        return word.replace("$", strNum);
      }

    return word;
  }

  private static String getStr(int num) {
    StringBuilder sb = new StringBuilder();

    if(num >= 100) {
      sb.append(ONE[num / 100]).append("hundred");
      num %= 100;
    }

    if(20 <= num){
      sb.append(TEN[1][num / 10]).append(ONE[num % 10]);
    } else if(10 <= num){
      sb.append(TEN[0][num%10]);
    } else {
      sb.append(ONE[num]);
    }

    return sb.toString();
  }
}