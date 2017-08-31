package lek29;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {

	// static final Runnable POISON_PILL = () -> {};

	boolean keepGoing = true;
	boolean stopNow = false;

	BlockingQueue<Runnable> tasks = new BlockingQueue<>();
	private Thread thread;

	public Worker() {
		thread = new Thread(this::processTasks);
		thread.start();
	}

	@Override
	public void execute(Runnable command) {
		if (keepGoing) {
			tasks.put(command);
		}
	}

	private void processTasks() {
		synchronized (tasks) {
			while (tasks.hasTasks() || keepGoing && !stopNow) {
				Runnable task = tasks.take();
				Optional.ofNullable(task).ifPresent(r -> r.run());
				if (stopNow) {
					tasks.notify();
					break;
				}
			}
		}

	}

	public void shutdown() {
		keepGoing = false;
	}

	public List<Runnable> shutdownNow() {
			stopNow = true;
			return tasks.toList();
	}

}
