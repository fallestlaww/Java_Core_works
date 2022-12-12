package minimum;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
	public static void main(String[] args) {
		ExecutorService executable1 = Executors.newFixedThreadPool(20);
		executable1.execute(new MyThread());
		executable1.execute(new RunnableThread());
		executable1.shutdown();
		
		ExecutorService executable2 = Executors.newCachedThreadPool();
		executable2.execute(new MyThread());
		executable2.execute(new RunnableThread());
		executable2.shutdown();
		
		ExecutorService executable3 = Executors.newSingleThreadExecutor();
		executable3.execute(new MyThread());
		executable3.execute(new RunnableThread());
		executable3.shutdown();
		
		ExecutorService executable4 = Executors.newWorkStealingPool(20);
		executable4.execute(new MyThread());
		executable4.execute(new RunnableThread());
		executable4.shutdown();
	}
}
