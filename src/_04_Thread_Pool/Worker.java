package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;

	Worker(ConcurrentLinkedQueue<Task> tq) {
		this.taskQueue = tq;
	}

	@Override
	public void run() {
		if (!taskQueue.isEmpty()) {
			Task task = taskQueue.remove();
			task.perform();
		}

	}

}
