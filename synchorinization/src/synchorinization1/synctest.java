package synchorinization1;



public class synctest {

	public static void main(String[] args) {
		String tname=Thread.currentThread().getName();
		System.out.println(tname+":main thread started");
		workerthread w=new workerthread();
		Thread t1=new Thread(new syncthread(w,10));
		t1.setName("ashok");
		t1.start();
		Thread t2=new Thread(new syncthread(w,30));
		t2.setName("avi");
		t2.start();
		Thread t3=new Thread(new syncthread(w,20));
		t3.setName("krishna");
		t3.start();
				
	}

}
