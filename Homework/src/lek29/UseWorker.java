package lek29;

public class UseWorker {

	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {
			Worker worker = new Worker();

			worker.execute(() -> {
				System.out.println("hello, ");
			});

			worker.execute(() -> {
				System.out.println("world!");
			});

			worker.shutdown();
		
			worker.execute(() -> {
				System.out.println("more");
			});
			
//			System.out.println(worker.tasks.items.size() + ":" + worker.shutdownNow());


//		}
	}

}
