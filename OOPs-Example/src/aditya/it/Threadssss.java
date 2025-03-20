package aditya.it;

public class Threadssss implements Runnable {

	public void run() {
		System.out.println("run() method started...." + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run () method ended...."+ Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Threadssss t = new Threadssss();
		Thread s = new Thread(t);
		s.setName("thread-1");
		s.setPriority(Thread.MAX_PRIORITY);

		Thread s1 = new Thread(t);
		s.setName("thread-2");
		s.setPriority(Thread.NORM_PRIORITY);

		Thread s3 = new Thread(t);
		s.setName("thread-3");
		s.setPriority(9);

		Thread s4 = new Thread(t);
		s.setName("thread-4");
		s.setPriority(Thread.MIN_PRIORITY);

		s.start();
		s1.start();

		s3.start();
		s4.start();
	}

}
