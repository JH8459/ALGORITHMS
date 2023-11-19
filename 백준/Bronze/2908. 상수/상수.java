import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String reverseS = new StringBuffer(s).reverse().toString(); // StringBuffer reverse() 메소드 사용

        int firstNum = Integer.parseInt(reverseS.split(" ")[0]);
        int secondNum = Integer.parseInt(reverseS.split(" ")[1]);

        bw.write(Math.max(firstNum, secondNum) + "\n");

        bw.flush();
    }
}