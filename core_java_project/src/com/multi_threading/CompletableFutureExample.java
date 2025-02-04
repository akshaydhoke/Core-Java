package com.multi_threading;

import java.util.concurrent.*;

// CompletableFuture allows for non-blocking asynchronous programming and helps in managing chains of asynchronous tasks.
// Lambda expressions simplify functional programming.

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 42;
        }).thenApplyAsync(result -> {
            return result * 2;
        });

        System.out.println("Result: " + future.get());  // Wait for the result
    }
}
