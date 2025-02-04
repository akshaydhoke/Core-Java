package com.multi_threading;

import java.util.concurrent.*;

// The Fork/Join Framework allows you to split tasks into smaller parts that can be executed in parallel, improving performance on multi-core systems.

public class ForkJoinExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ForkJoinPool pool = new ForkJoinPool();
        RecursiveTask<Integer> task = new RecursiveTask<>() {
            @Override
            protected Integer compute() {
                // Perform some computation, e.g., sum numbers
                return 42;
            }
        };

        Future<Integer> result = pool.submit(task);
        System.out.println("Fork/Join result: " + result.get());
        pool.shutdown();
    }
}
