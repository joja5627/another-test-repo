package io.example.async.streams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncStreamImplTest {

    @Autowired
    AsyncStreamImpl asyncStreamImpl;

    @Test
    public void runTheSreamTest(){
        asyncStreamImpl.runTheStream();
    }
}
