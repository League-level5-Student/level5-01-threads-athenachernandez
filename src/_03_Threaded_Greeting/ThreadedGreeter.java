package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	int num = 0;
	
	ThreadedGreeter(int n) {
		this.num = n;
	}
	
	@Override
	public void run() {
		System.out.println("Hello from thread number: " + num);
		if (num < 50) {
			Thread thread = new Thread(new ThreadedGreeter(num+1));
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
