package SleepWake;

public class testSW {
	public static void main(String[] args)  {
		String tname=Thread.currentThread().getName();
		System.out.println(tname+":main method begin");
		threadSW w=new threadSW();
		Thread wt=new Thread(w);
		wt.setName("worker");
		wt.start();
		synchronized(wt) {

			System.out.println(tname + ": waiting...");
			try {
				wt.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	
		System.out.println(tname+":total="+w.total1());
		}
		System.out.println(tname+":main method ended");
	}


}
