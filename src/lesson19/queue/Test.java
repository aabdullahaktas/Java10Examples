package lesson19.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Test {
	
	public static void main(String[] args) {
		Queue<Integer> kuyruk1 = new LinkedList<>();
		Queue<Integer> kuyruk2 = new ArrayBlockingQueue<>(5);
		Queue<Integer> kuyruk3 = new ConcurrentLinkedDeque<>();
		// kuyruk 1
		kuyruk1.add(25);
		kuyruk1.add(50);
		
		System.out.println(kuyruk1.peek());
		System.out.println(kuyruk1.peek());
		System.out.println(kuyruk1.peek());
		System.out.println(kuyruk1.peek());
		System.out.println("pool");
		System.out.println(kuyruk1.poll());
		System.out.println(kuyruk1.peek());
		System.out.println(kuyruk1.poll());
		System.out.println(kuyruk1.peek());
		//kuyruk 2
		//kuyruk2.add(20);
		//kuyruk2.add(30);
		//kuyruk2.add(40);
		//kuyruk2.add(50);
		//kuyruk2.add(60);
		//kuyruk2.add(70);
		System.out.println("offer");
		kuyruk2.offer(20);
		kuyruk2.offer(30);
		kuyruk2.offer(40);
		kuyruk2.offer(50);
		boolean kontrol1 = kuyruk2.offer(60);
		boolean kontrol2 = kuyruk2.offer(70);
		System.out.println(kontrol1);
		System.out.println(kontrol2);
		while (!kuyruk2.isEmpty()) {
			System.out.println(kuyruk2.poll());
		}

		/// oncelikli kuyruk 
		
		System.out.println("-------------oncelikli kuyruk-----------");
		Queue<Integer> kuyruk4 = new PriorityQueue<>();
		
		kuyruk4.offer(50);
		kuyruk4.offer(30);
		kuyruk4.offer(80);
		kuyruk4.offer(20);
		kuyruk4.offer(90);
		System.out.println(kuyruk4.peek());
		System.out.println("foreach yazdırımı");
		for (Integer integer : kuyruk4) {
			System.out.println(integer);
		}
		
		System.out.println("kuyruktan sırayla yazdırma");
		while (!kuyruk4.isEmpty()) {
			System.out.println(kuyruk4.poll());
		}
		
		Queue<Musteri> musteriler = new PriorityQueue<>();
		musteriler.offer(new Musteri("mustafa", 35));
		musteriler.offer(new Musteri("ali", 65));
		musteriler.offer(new Musteri("tuba", 26));
		musteriler.offer(new Musteri("ahmet", 15));
		musteriler.offer(new Musteri("tuba", 26));
		
		while (!musteriler.isEmpty()) {
			System.out.println(musteriler.poll());
		}
	}

}
