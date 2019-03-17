package io.example.async.streams;

import org.springframework.stereotype.Service;

@Service
public class SomeService {

    public String runTheService(){
        return Thread.currentThread().getName();
    }

}
