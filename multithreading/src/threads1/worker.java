package threads1;

public class worker implements Runnable {

	@Override
	public void run() {
String tname=Thread.currentThread().getName();
System.out.println(tname+":worker thread started");
for(int i=0;i<=10;i++) {
	System.out.println(tname+":"+i);
	}
System.out.println(tname+":worker thread ended");
}}
