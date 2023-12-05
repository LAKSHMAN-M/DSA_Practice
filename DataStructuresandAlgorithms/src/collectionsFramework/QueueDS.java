package collectionsFramework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {

	public static void main(String[] args) {
		Queue<String> queue	 = new LinkedList<>();
//		System.out.println(queue.isEmpty());
		queue.offer("A");
		queue.offer("B");
		queue.offer("E");
		queue.offer("e");
		queue.offer("w");
		queue.offer("wq");
//		System.out.println(queue.size());
//		System.out.println(queue);
//		System.out.println(queue.isEmpty());
		String[] str = queue.toArray(String[]::new);
		System.out.println(Arrays.toString(str));
	}

}
