package aditya.it;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CollablesMethod implements Callable {

	@Override
	public Object call() throws Exception {
		System.out.println("callable () - Method Started.....");
		return "yes, it is sucess";
	}

	public static void main(String[] args) throws Exception {
		CollablesMethod M = new CollablesMethod();
		ExecutorService exService = Executors.newFixedThreadPool(10);
		for (int i = 1; i <= 15; i++) {
			Future submit = exService.submit(M);
			System.out.println(submit.get().toString());
		}
		exService.shutdown();
	}

}
