import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int month = Integer.parseInt(st.nextToken());
    int day = Integer.parseInt(st.nextToken());

    bw.write(getDate(month, day) + "\n");
    bw.flush();
    bw.close();
  }

  public static String getDate (int month, int day){
    String[] date = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    int totalDay = day;

    while (month > 0){
      switch (month - 1) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          totalDay += 31;
          break;
        case 4:
        case 6:
        case 9:
        case 11:
          totalDay += 30;
          break;
        case 2:
          totalDay += 28;
          break;
      }

      month--;
    }

    return date[totalDay % 7];
  }
}