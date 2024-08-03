import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int a_x = Integer.parseInt(st.nextToken());
    int a_y = Integer.parseInt(st.nextToken());
    int b_x = Integer.parseInt(st.nextToken());
    int b_y = Integer.parseInt(st.nextToken());
    int c_x = Integer.parseInt(st.nextToken());
    int c_y = Integer.parseInt(st.nextToken());

    boolean isLinear = (b_x - a_x) * (c_y - a_y) == (c_x - a_x) * (b_y - a_y);

    double ab = getDistance(a_x, a_y, b_x, b_y);
    double ac = getDistance(a_x, a_y, c_x, c_y);
    double bc = getDistance(b_x, b_y, c_x, c_y);

    double maxLength = Math.max( 2 * (ab + ac), Math.max(2 * (ab + bc), 2 * (ac + bc)));
    double minLength = Math.min( 2 * (ab + ac), Math.min(2 * (ab + bc), 2 * (ac + bc)));

    bw.write(isLinear ? "-1.0" : maxLength - minLength + "\n");

    bw.flush();
    bw.close();
  }

  public static double getDistance (int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  }
}