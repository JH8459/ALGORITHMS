import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int month = Integer.parseInt(br.readLine());
    int date = Integer.parseInt(br.readLine());

    if(month > 2){
      bw.write("After\n");
    } else if (month < 2){
      bw.write("Before\n");
    } else {
      if(date > 18){
        bw.write("After\n");
      } else if(date < 18){
        bw.write("Before\n");
      } else {
        bw.write("Special\n");
      }
    }

    bw.flush();
    bw.close();
  }
}