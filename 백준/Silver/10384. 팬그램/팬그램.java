import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for(int i = 1; i <= n; i++) {
      int[] alphabetCntArr = new int[26];

      String s = br.readLine();

      for(int j = 0; j < s.length(); j++) {
        char ch = s.charAt(j);

        if(ch >= 'A' && ch<='Z') {
          alphabetCntArr[ch -'A']++;
        }

        if(ch >= 'a' && ch <= 'z') {
          alphabetCntArr[ch - 'a']++;
        }
      }

      int pangramCheckCnt = 0;
      int doublePangramCheckCnt = 0;
      int triplePangramCheckCnt = 0;

      for(int j = 0; j < 26; j++) {
        if(alphabetCntArr[j] >= 1) {
          pangramCheckCnt++;
        }

        if(alphabetCntArr[j] >= 2) {
          doublePangramCheckCnt++;
        }

        if(alphabetCntArr[j] >= 3){
          triplePangramCheckCnt++;
        }
      }

      if(triplePangramCheckCnt == 26) {
        bw.write("Case " + i + ": Triple pangram!!!\n");
      } else if(doublePangramCheckCnt == 26) {
        bw.write("Case " + i + ": Double pangram!!\n");
      } else if(pangramCheckCnt == 26) {
        bw.write("Case " + i + ": Pangram!\n");
      } else {
        bw.write("Case " + i + ": Not a pangram\n");
      }
    }

    bw.flush();
    bw.close();
  }
}