import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	public static void main(String[] args) throws Exception, ExecutionException {
		/*// TODO Auto-generated method stub
		
		Timer time = new Timer(); // Instantiate Timer Object
		ScheduleTask st = new ScheduleTask(); // Instantiate SheduledTask class
		time.schedule(st, 0, 20000);
		
		String transactionId = java.util.UUID.randomUUID().toString();
		
		System.out.println(transactionId);*/
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		M1 m1 = new M1();
		M2 m2 = new M2();
		
		Future<Object> task1 =  service.submit(m1);
		Future<Object> task2 =  service.submit(m2);
		
		
		
		service.shutdown();
		
		
		System.out.println(task1.get().toString());
		
		
		System.out.println(task2.get().toString());
		
		
		

	}
	
	

}
