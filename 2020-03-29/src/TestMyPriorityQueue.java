import java.util.PriorityQueue;

public class TestMyPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(9);
		pq.offer(2);
		pq.offer(10);
		pq.offer(15);
		pq.offer(3);
		pq.offer(1);
		pq.offer(7);
		pq.offer(23);
		pq.offer(89);
		while (!pq.isEmpty()) {
			System.out.print(pq.poll() + " ");
		}
		System.out.println();

		System.out.println("My PriorityQueue");
		MyPriorityQueue mpq = new MyPriorityQueue();
		mpq.offer(9);
		mpq.offer(2);
		mpq.offer(10);
		mpq.offer(15);
		mpq.offer(3);
		mpq.offer(1);
		mpq.offer(7);
		mpq.offer(23);
		mpq.offer(89);
		while (!mpq.isEmpty()) {
			System.out.print(mpq.poll() + " ");
		}
		System.out.println();
	}
}
