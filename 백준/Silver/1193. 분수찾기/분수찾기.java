import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine()); // X

        bw.write(getResult(x) + "\n");

        bw.flush();
    }

    // X번째 분수를 구하는 메서드
    public static String getResult(int x) {
        int sum = 3; // 분자+분모의 합
        String result = ""; // 결과를 담을 문자열

        if (x == 1) {
            return "1/1";
        } else {
            while (x > 0) {
                for (int i = 1; i < sum; i++) {
                    // 분자+분모 합까지 i를 제어
                    x--;

                    if (sum % 2 == 1) {
                        if (x == 1) {
                            result = i + "/" + (sum - i);

                            break;
                        }
                    } else {
                        if (x == 1) {
                            result = (sum - i) + "/" + i;

                            break;
                        }

                    }

                }

                sum++;
            }

            return result;
        }
    }
}