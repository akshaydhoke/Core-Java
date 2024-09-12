package com.multi_threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
	public static void main(String[] args) {
	
/*
		// Create an ExecutorService with a fixed thread pool of size 3
		ExecutorService executor = Executors.newFixedThreadPool(3);

		// Submit tasks to the executor
		for (int i = 1; i <= 10; i++) {
			final int taskNumber = i;
			executor.submit(() -> {
				String threadName = Thread.currentThread().getName();
				System.out.println("Task " + taskNumber + " executed by " + threadName);
			});
		}

		// Shutdown the executor after all tasks are submitted
		executor.shutdown();
		
*/
		
        // For Future Purpose ::
		
        // Create an ExecutorService with a single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit a task and receive a Future
        Future<String> future = executor.submit(() -> {
            Thread.sleep(2000); // Simulate a time-consuming task
            return "Hello from the Future!";
        });

        // Perform other operations while the task is running asynchronously
        System.out.println("Main thread continues to do other work...");

        // Check if the task is done
        while (!future.isDone()) {
            System.out.println("Task is not yet completed...");
            try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Check again after a short delay
        }

        // Retrieve the result of the computation
        String result = null;
		try {
			result = future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // This blocks until the result is available
        System.out.println("Task completed! Result: " + result);

        // Shutdown the ExecutorService
        executor.shutdown();
		
		
	}
}
