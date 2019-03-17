package io.example.async.streams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskIntegrationTest {

    @MockBean
    SomeService someService;

    @Test
    public void taskIntegrationTest(){
        when(someService.runTheService()).thenReturn("someService");
        Task task = new Task("1",2,someService);

    }


}
