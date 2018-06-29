public class ThreadPool implements Runnable {
	
	private Message message;

	public ThreadPool(Message message) {
		
		this.message = message;
	}

	@Override
	public void run() {
		
		System.out.println("Message Type  "+message.getMessageType());
		
	}

}
