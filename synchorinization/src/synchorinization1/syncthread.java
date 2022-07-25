package synchorinization1;

public class syncthread implements Runnable {
private int n;
workerthread w;
syncthread(workerthread w,int n){
	this.w=w;
this.n=n;

	}
	@Override
	public void run() {
	w.add(n);
	}

}
