import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(br.readLine());

    bw.write(factorial(number)+ "\n");
    bw.flush();
    bw.close();
  }

  public static int factorial (int number){
    if(number <= 1){
      return 1;
    }

    return number * factorial(number - 1);
  }
}