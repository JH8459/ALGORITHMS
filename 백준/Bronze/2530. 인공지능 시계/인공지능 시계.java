import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = br.readLine();
    int hours = Integer.parseInt(s.split(" ")[0]);
    int minutes = Integer.parseInt(s.split(" ")[1]);
    int seconds = Integer.parseInt(s.split(" ")[2]);

    int time = Integer.parseInt(br.readLine());

    int resultHours = 0;
    int resultMinutes = 0;
    int resultSeconds = 0;

    if (seconds + time >= 60) {
      minutes = minutes + ((seconds + time) / 60);
    }

    resultSeconds = (seconds + time) % 60;

    if (minutes >= 60) {
      hours = hours + (minutes / 60);
    }

    resultMinutes = minutes % 60;

    resultHours = hours % 24;

    bw.write(resultHours + " " + resultMinutes + " " + resultSeconds + "\n");
    bw.flush();
    bw.close();
  }
}