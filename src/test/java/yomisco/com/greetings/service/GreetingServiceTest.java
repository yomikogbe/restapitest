package yomisco.com.greetings.service;

import org.junit.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by kogbe on 28/05/2018.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "yomisco.com")
public class GreetingServiceTest {

    @Test
    public void   greetingsHiServ(){

    }

    @Test
    public void   greetingsByeServ(){

    }
}
