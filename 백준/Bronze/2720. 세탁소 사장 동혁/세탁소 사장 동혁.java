import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수 T

        for (int i = 1; i <= t; i++) {
            int c = Integer.parseInt(br.readLine()); // 거스름돈 C

            bw.write(convertChange(c) + "\n");
        }

        bw.flush();
    }

    // 잔돈 전환 메서드
    public static String convertChange(final int c) {
        int rest = c;
        String result = "";

        int quater = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        // quater
        if (rest >= quater) {
            result = result + String.valueOf(rest / quater) + " ";

            rest = rest % quater;
        } else {
            result += "0 ";
        }
        // dime
        if (rest >= dime) {
            result = result + String.valueOf(rest / dime) + " ";

            rest = rest % dime;
        } else {
            result += "0 ";
        }
        // nickel
        if (rest >= nickel) {
            result = result + String.valueOf(rest / nickel) + " ";

            rest = rest % nickel;
        } else {
            result += "0 ";
        }
        // penny
        if (rest >= penny) {
            result += String.valueOf(rest / penny);
        } else {
            result += "0";
        }

        return result;
    }
}