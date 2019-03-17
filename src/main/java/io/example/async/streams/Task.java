package io.example.async.streams;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;


import java.util.function.Supplier;


public class Task implements Supplier{

    Logger logger = LoggerFactory.getLogger(Task.class);

    private int waitTime;
    private String taskName;
    private SomeService someService;

    public Task(String tname,int milliWait, SomeService service){
        waitTime = milliWait;
        taskName = tname;
        someService = service;
    }

    @Override
    public Object get() {
        logger.info(taskName +" - start - " +Thread.currentThread().getName());
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info(someService.runTheService());
        logger.info(taskName +" - end - " +Thread.currentThread().getName());
        return taskName;
    }
}
