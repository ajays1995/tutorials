import java.util.concurrent.Callable;

public class M1 implements Callable<Object> {

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return new Message1().sayhello();
	}
	
	
	
}

