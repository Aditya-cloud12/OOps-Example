package aditya.it;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callabless implements Callable{

	@Override
	public Object call() throws Exception {
		System.out.println("call () - Method executed....");
		return "Success";
	}
	
	public static void main(String[] args) throws Exception {
		Callabless C = new Callabless();
		 ExecutorService exService = Executors.newFixedThreadPool(10);
		 for ( int i = 1; i<=15 ; i++) {
		 Future submit = exService.submit(C);
		 System.out.println(submit.get().toString());
		 }
		 exService.shutdown();
	}
	
	

}
