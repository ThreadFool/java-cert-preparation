package threadfool.op.chapter1;

import java.util.Random;
import java.util.concurrent.Executors;

public class VirtualThreadsExample {

	public static void main(String[] args){
		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

			for (int i = 0; i < 1_000; i++) {
				int taskId = i;
				executor.submit(() -> {
					int random = new Random().nextInt(10000);
					Thread.sleep(random);
					System.out.println("Thread slowed by" + random + "ms");
					return null;
				});
			}
		}
	}
}
