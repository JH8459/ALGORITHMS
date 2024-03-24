import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    char[][] chArr = new char[n][n];

    boolean isFlag = false;
    int heartX = 0, heartY = 0;

    for(int i = 0; i < n; i++){
      String str = br.readLine();

      for(int j = 0; j < n; j++){
        char ch = str.charAt(j);

        chArr[i][j] = ch;

        if(!isFlag && ch == '*'){
          isFlag = true;

          heartX = i + 2;
          heartY = j + 1;
        }
      }
    }

    int leftArmLength = 0;
    for(int i = 0; i < heartY - 1; i++){
      if(chArr[heartX - 1][i] == '*'){
        leftArmLength += 1;
      }
    }

    int rightArmLength = 0;
    for(int i = heartY; i < n; i++){
      if(chArr[heartX - 1][i] == '*'){
        rightArmLength += 1;
      }
    }

    int waistLength = 0;
    int tailBornX = 0, tailBornY = 0;
    for(int i = heartX; i < n; i++){
      if(chArr[i][heartY - 1] == '*'){
        waistLength += 1;
      } else {
        tailBornX = i - 1;
        tailBornY = heartY - 1;
        break;
      }
    }

    int leftLegLength = 0;
    for(int i = tailBornX; i < n; i++){
      if(chArr[i][tailBornY - 1] == '*'){
        leftLegLength += 1;
      }
    }

    int rigthLegLength = 0;
    for(int i = tailBornX; i < n; i++){
      if(chArr[i][tailBornY + 1] == '*'){
        rigthLegLength += 1;
      }
    }

    bw.write(heartX + " " + heartY + "\n");
    bw.write(leftArmLength + " " + rightArmLength + " " + waistLength + " " + leftLegLength + " " + rigthLegLength + " " + "\n");
    bw.flush();
    bw.close();
  }
}