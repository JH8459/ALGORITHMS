import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int start = 0;
    int end = 0;

    StringTokenizer st = new StringTokenizer(br.readLine(), ":");
    int startHour = Integer.parseInt(st.nextToken());
    int startMinute = Integer.parseInt(st.nextToken());
    int startSecond = Integer.parseInt(st.nextToken());

    start = (startHour * 3600) + (startMinute * 60) + startSecond;

    st = new StringTokenizer(br.readLine(), ":");
    int endHour = Integer.parseInt(st.nextToken());
    int endMinute = Integer.parseInt(st.nextToken());
    int endSecond = Integer.parseInt(st.nextToken());

    end = (endHour * 3600) + (endMinute * 60) + endSecond;

    int gap = 0;

    if(end > start) {
      gap = end - start;
    }else {
      gap = (24 * 3600) - (start - end);
    }

    StringBuilder sb = new StringBuilder();
    int hour = gap / 3600;
    int minute = (gap / 60) % 60;
    int second = gap % 60;

    sb.append(hour < 10 ? "0" + hour : hour);
    sb.append(":");
    sb.append(minute < 10 ? "0" + minute : minute);
    sb.append(":");
    sb.append(second < 10 ? "0" + second : second);

    bw.write(sb + "\n");
    bw.flush();
    bw.close();
  }
}