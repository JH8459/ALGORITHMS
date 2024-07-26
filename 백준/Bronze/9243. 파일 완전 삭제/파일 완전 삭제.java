import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String s1 = br.readLine();
    String s2 = br.readLine();

    boolean isDeleted = true;

    for(int i = 0; i < s1.length(); i++){
      if(n % 2 == 0){
        if(s1.charAt(i) != s2.charAt(i)){
          isDeleted = false;
          break;
        }
      } else {
        if(s1.charAt(i) == s2.charAt(i)){
          isDeleted = false;
          break;
        }
      }
    }

    bw.write(isDeleted ? "Deletion succeeded\n" : "Deletion failed\n");
    bw.flush();
    bw.close();
  }
}