import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int waveLength = Integer.parseInt(br.readLine());

    bw.write(getStarColor(waveLength) + "\n");
    bw.flush();
    bw.close();
  }

  public static String getStarColor (int waveLength) {
    if(waveLength >= 620){
      return "Red";
    } else if(waveLength >= 590){
      return "Orange";
    } else if(waveLength >= 570){
      return "Yellow";
    } else if(waveLength >= 495){
      return "Green";
    } else if(waveLength >= 450){
      return "Blue";
    } else if(waveLength >= 425){
      return "Indigo";
    } else {
      return "Violet";
    }
  }
}