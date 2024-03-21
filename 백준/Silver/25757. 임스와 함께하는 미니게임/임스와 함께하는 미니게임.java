import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    char game = st.nextToken().charAt(0);

    int player = getPlayer(game);
    HashSet<String> hm = new HashSet<>();

    int result = 0;

    for(int i = 0; i < n; i++){
      String people = br.readLine();

      if(!hm.contains(people)){
        result += 1;
      }

      hm.add(people);
    }

    bw.write(result / player + "\n");
    bw.flush();
    bw.close();
  }

  public static int getPlayer(char ch){
    int player = 0;

    if(ch == 'Y') player = 1;
    else if(ch == 'F') player = 2;
    else if(ch == 'O') player = 3;

    return player;
  }
}