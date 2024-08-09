import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    int[] nArr = new int[s.length()];

    for(int i = 0; i < s.length(); i++){
      nArr[i] = Integer.parseInt(s.substring(i, i + 1));
    }

    boolean isMountain = isCheckMountain(nArr, s.length());

    bw.write(isMountain ? "ALPSOO\n" : "NON ALPSOO\n");
    bw.flush();
    bw.close();
  }

  public static boolean isCheckMountain(int[] nArr, int length){
    boolean isMountain = true;

    int prevGap = 0;

    for(int i = 1; i < length; i++){
      int prev = nArr[i - 1];
      int now = nArr[i];
      int gap = now - prev;

      if(gap == 0) {
        isMountain = false;
      } else {
       if(i == 1){
          if(gap < 0){
            isMountain = false;
          }
       } else if(i < length - 1){
         if(prevGap * gap > 0 && prevGap != gap){
           isMountain = false;
         }
       } else if(i == length - 1){
         if(gap > 0){
           isMountain = false;
         }
       }
      }

      prevGap = gap;
    }

    return isMountain;
  }
}