package threads1;

public class thread extends Thread{

	public static void main(String[] args) {
		thread t=new thread();
		t.start();
		

		for(int i=0;i<=10;i++) {
			System.out.println("main thread"+i);
		}
		
	}
@Override
public void run() {
	for(int i=0;i<=10;i++) {
		System.out.println("concurrent thread"+i);
	}
	
}
}
