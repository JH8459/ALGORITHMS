import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int burger1 = Integer.parseInt(br.readLine());
    int burger2 = Integer.parseInt(br.readLine());
    int burger3 = Integer.parseInt(br.readLine());

    int drink1 = Integer.parseInt(br.readLine());
    int drink2 = Integer.parseInt(br.readLine());

    int burgerMin = Math.min(burger1, Math.min(burger2, burger3));
    int drinkMin = Math.min(drink1, drink2);

    bw.write(burgerMin + drinkMin - 50 + "\n");

    bw.flush();
    bw.close();
  }
}