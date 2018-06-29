import java.util.concurrent.Callable;

public class M2 implements Callable<Object> {

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return new Message2().sayhello();
	}

}
