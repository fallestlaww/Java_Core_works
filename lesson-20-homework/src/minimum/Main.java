package minimum;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyThread mythread = new MyThread();
		mythread.start();
		mythread.join();
		mythread.sleep(10);
		System.out.println();
		RunnableThread runnablethread = new RunnableThread();
		Thread runnthread1 = new Thread(runnablethread);
		runnthread1.start();
		runnthread1.join();
		runnthread1.sleep(10);
	}

}
