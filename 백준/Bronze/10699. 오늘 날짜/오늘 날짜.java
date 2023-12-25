import java.io.*;
import java.text.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    Date today = new Date();
    SimpleDateFormat convertDate = new SimpleDateFormat("yyyy-MM-dd");

    bw.write(convertDate.format(today) + "\n");
    bw.flush();
    bw.close();
  }
}