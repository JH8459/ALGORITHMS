import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a + b + c != 180) {
            bw.write("Error\n");
        } else {
            if (a == b && b == c) {
                bw.write("Equilateral\n");
            } else if (a == b || b == c || a == c) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }
        }

        bw.flush();
    }
}