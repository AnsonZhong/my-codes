package top.spring.ioc.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Zoo {

    @Bean
    public Master master(){
        return new Master(new Annimal[]{new Tiger()});
    }
}
