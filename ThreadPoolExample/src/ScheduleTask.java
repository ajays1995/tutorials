import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduleTask  extends TimerTask{
	
	BlockingQueue workQueue = new LinkedBlockingQueue();
	ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 10, Long.MAX_VALUE, TimeUnit.SECONDS, workQueue);

	@Override
	public void run() {
		List<Message> list = new ArrayList<Message>();
		
		File file = new File("records.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			for(int i=0;i<10;i++) {
				String line = reader.readLine();
				String [] eachMessage = line.split(",");
				Message message = new Message(eachMessage[0],eachMessage[1],eachMessage[2]);
				list.add(message);
				
			}
			Iterator<Message> it = list.iterator();
			while(it.hasNext()) {
				
				ThreadPool pool = new ThreadPool(it.next());
				executor.setRejectedExecutionHandler(new RejectedExecutionHandler(){

					@Override
					public void rejectedExecution(Runnable arg0, ThreadPoolExecutor arg1) {
						//log message type and id						
					}
					
				});
				Future future = executor.submit(pool);
				future.get();
				
				
			}
			//executor.shutdown();
		
	}
	catch(Exception e){
		e.printStackTrace();
	}

	}
}
