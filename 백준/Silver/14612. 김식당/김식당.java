import java.io.*;
import java.util.*;

public class Main {
  public static class Order implements Comparable<Order> {

    int table;
    int time;

    private Order(int table, int time){
      this.table = table;
      this.time = time;
    }

    @Override
    public int compareTo(Order order) {
      if (order.time < time) {
        return 1;
      } else if (order.time > time) {
        return -1;
      } else {
        if(order.table < table){
          return 1;
        } else if(order.table > table){
          return - 1;
        }
      }

      return 0;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    ArrayList<Order> mList = new ArrayList<>();

    while (n-- > 0){
      st = new StringTokenizer(br.readLine());

      String command = st.nextToken();

      if(Objects.equals(command, "order")){
        // order
        int table = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(st.nextToken());

        mList.add(new Order(table, time));
      } else if(Objects.equals(command, "sort")){
        // sort

        Collections.sort(mList);
      } else {
        // complete
        int table = Integer.parseInt(st.nextToken());

        mList.removeIf(order -> order.table == table);
      }

      if(!mList.isEmpty()){
        for (Order order : mList) {
          int table = order.table;

          bw.write(table + " ");
        }
      } else {
        bw.write("sleep");
      }

      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}