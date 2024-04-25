import java.io.*;
import java.util.*;

public class Main {

  public static class Student {
    private String name;
    private int date;
    private int month;
    private int year;

    public Student (String name, int date, int month, int year){
      this.name = name;
      this.date = date;
      this.month = month;
      this.year = year;
    }

    public String getName() {
      return this.name;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    ArrayList<Student> nList = new ArrayList<Student>();

    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      nList.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
          Integer.parseInt(st.nextToken())));
    }

    nList.sort(new Comparator<Student>() {
      @Override
      public int compare(Student s1, Student s2) {
        if (s1.year == s2.year) {
          if (s1.month == s2.month) {
            return Integer.compare(s1.date, s2.date);
          } else {
            return Integer.compare(s1.month, s2.month);
          }
        }
        return Integer.compare(s1.year, s2.year);
      }
    });

    bw.write(nList.get(nList.size() - 1).getName() + "\n" + nList.get(0).getName() + "\n");
    bw.flush();
    bw.close();
  }
}