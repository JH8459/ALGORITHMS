import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();

    char ch = s.charAt(n - 1);

    bw.write(getIsPopCharacter(ch) + "\n");

    bw.flush();
    bw.close();
  }

  public static int getIsPopCharacter (char ch){
    char[] propArr = {'q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v'};

    for(char prop : propArr){
      if(prop == ch){
        return 1;
      }
    }

    return 0;
  }
}