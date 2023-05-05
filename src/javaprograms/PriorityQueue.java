package javaprograms;

public class PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		q.add(20);
		q.add(60);
		q.add(2);
		q.add(120);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}

}
