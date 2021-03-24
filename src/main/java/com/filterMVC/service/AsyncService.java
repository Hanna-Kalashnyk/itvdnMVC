package com.filterMVC.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {
    @Async("ThreadPoolTaskExecutor")
    public CompletableFuture<Integer> doAcync(){
        System.out.println("Method started");
       try {
           Thread.sleep(10000L);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        System.out.println("Hello all!");
        System.out.println("Method finished");

        return CompletableFuture.completedFuture(1);
    }
}
