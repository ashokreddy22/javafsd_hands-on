package SleepWake;

public class threadSW implements Runnable {
	private int total;
	public int total1() {
		return total;
	}
	@Override
	public void run() {
		String tname=Thread.currentThread().getName();

		
for(int i=1;i<=10;i++) {
	total +=i;
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(tname+":total:"+total);
}
	}

}
