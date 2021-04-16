package blockbreaker;

public class Animate implements Runnable{
	BlockBreaker blockpanel;

	public Animate(BlockBreaker b) {
		blockpanel = b;
	}
	
	public void run() {
		while (true){
			blockpanel.update();
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
