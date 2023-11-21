import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] alphabetArr = new int[alphabet.length()];

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i)).toUpperCase(); // char => string 형변환

            int index = alphabet.indexOf(ch);
            alphabetArr[index]++;
        }

        int max = Arrays.stream(alphabetArr).max().getAsInt(); // Arrays.stream 변환 후 최대값 추출
        String maxAlphabet = "";

        for (int i = 0; i < alphabetArr.length; i++) {
            if (alphabetArr[i] == max) {
                if (maxAlphabet == "") {
                    maxAlphabet = String.valueOf(alphabet.charAt(i)).toUpperCase();
                } else {
                    maxAlphabet = "?";

                    break;
                }
            }
        }

        bw.write(maxAlphabet + "\n");

        bw.flush();
    }
}