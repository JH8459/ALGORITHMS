import java.io.*;
import java.util.*;

public class Main {
  public static class User {
    int age;
    String name;

    public User (int age, String name) {
      this.age = age;
      this.name = name;
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());  // 회원의 수 N ( 1 ~ 100,000 )
    User[] userArr = new User[n];


    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int age = Integer.parseInt(st.nextToken());
      String name = st.nextToken();

      userArr[i] = new User(age, name);
    }

    Arrays.sort(userArr, Comparator.comparingInt(userA -> userA.age));  // user 객체의 age 키 값으로 정렬

    for (int i = 0; i < n; i++){
      bw.write(userArr[i].age + " " + userArr[i].name + "\n");
    }

    bw.flush();
    bw.close();
  }
}