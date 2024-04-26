import java.util.PriorityQueue;

public class ExPriorityQueue {

    public static void main(String[] args) {


        /*
        *
        * By default min heap: Natural ordering is ascending order
        * */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));


        priorityQueue.offer(10);
        priorityQueue.offer(9);
        priorityQueue.offer(8);
        priorityQueue.offer(7);


        maxPriorityQueue.offer(10);
        maxPriorityQueue.offer(9);
        maxPriorityQueue.offer(8);
        maxPriorityQueue.offer(7);

        priorityQueue.forEach(System.out::println);

        maxPriorityQueue.forEach(System.out::println);
    }
}
