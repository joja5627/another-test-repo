package io.example.async.streams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AsyncStreamImpl {

    @Autowired
    SomeService someService;

    void runTheStream(){

        List<Task> tasks = Arrays.asList(new Task("task 1",1,someService),
                new Task("task 2",2,someService),
                new Task("task 3",3,someService),
                new Task("task 4",4,someService));

        List<String> results = tasks.stream().parallel().map(Task::get).map(res -> (String) res ).collect(Collectors.toList());

    }

}
