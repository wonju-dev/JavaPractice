import java.util.PriorityQueue;

public class main {

    public static void main(String args[]) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(1);
        pq.add(5);
        pq.add(2);
        pq.add(4);
        pq.add(3);

        Object obj;

        while ((obj = pq.poll()) != null) {
            System.out.println(obj);
        }
    }
}
