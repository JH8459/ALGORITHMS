import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for(int i = 1; i <= t ; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int h = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int s = Integer.parseInt(st.nextToken());

      // 정각 = 0도 기준
      // 반직선의 각도를 구할 땐 하위 요소(시 = 분 + 초, 분 = 초)의 위치를 고려해야한다.
      double smallAngle = getSmallAngle((double) h, (double) m, (double) s);

      bw.write(Math.round(smallAngle * 1000000) / 1000000.0 + "\n");
    }

    bw.flush();
    bw.close();
  }

  private static double getSmallAngle(double h, double m, double s) {
    // 시침 = (시 / 12 * 360) + ((분 / 60 * 360) / 12) + ((초 / 60 * 360) / 12 / 12 / 5)
    double a = ((h / 12) * 360) + (((m / 60) * 360) / 12) + (((s / 60) * 360) / 12 / 12 / 5);
    // 분침 = (분 / 60 * 360) + ((초 / 60 * 360) / 12 / 5)
    double b = (m / 60) * 360 + (((s / 60) * 360) / 12 / 5);
    // 초침 = (초 / 60) * 360;
    double c = (s / 60) * 360;

    // 각도의 크기가 180도가 초과된다면 보다 적은 각도를 산출하기 위한 역산.
    double angle1 = Math.abs(a - b) > 180 ? 360 - Math.abs(a - b) : Math.abs(a - b);
    double angle2 = Math.abs(b - c) > 180 ? 360 - Math.abs(b - c) : Math.abs(b - c);
    double angle3 = Math.abs(c - a) > 180 ? 360 - Math.abs(c - a) : Math.abs(c - a);

    return Math.min(Math.min(angle1, angle2), angle3);
  }
}