import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    /*
     * 그리디 알고리즘
     * Do to! 코딩 테스트 211.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String st = br.readLine();
    String[] stArr = st.split("-"); // - 기준으로 split

    int result = 0;

    for(int i = 0; i < stArr.length; i++){
      if(i == 0){
        result = getSum(stArr[i]);
      } else {
        result -= getSum(stArr[i]);
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }

  public static int getSum (String st) {
    String[] stArr = st.split("[+]"); // + 기준으로 split

    int sum = 0;

    for (String s : stArr) {
      sum += Integer.parseInt(s);
    }

    return sum;
  }
}