package threads1;

public class testrunnable {

	public static void main(String[] args) throws InterruptedException {
		String tname=Thread.currentThread().getName();
		System.out.println(tname+":main thread started");
		worker w=new worker();
		Thread t=new Thread(w);
		t.setName("t1");
		t.start();
		t.join();
		System.out.println(tname+":main thread ended");
	}

}
