package synchorinization1;

public class workerthread {
	

public synchronized void add(int n) {
String tname=Thread.currentThread().getName();

for(int i=0;i<=10;i++) {
	
	System.out.println(tname+":"+ n);
	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
}
}
