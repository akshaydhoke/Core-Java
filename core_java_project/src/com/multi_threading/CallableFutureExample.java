package com.multi_threading;

import java.util.concurrent.*;

//Callable allows threads to return a result or throw exceptions.
//Future is used to retrieve the result of a Callable task.

public class CallableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Task result: " + future.get());  // Waits for the result
        executor.shutdown();
    }
}

