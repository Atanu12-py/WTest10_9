package org.wtest;

import Mail.SendMail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanClass {
    @Bean
    public GetMap getm(){
        return new GetMap();
    }

    @Primary
    @Bean
    public GetMap getm1(){
        return new GetMap("SpringBoot test");
    }

//    @Bean
//    public SendMail smail(){
//        return new SendMail();
//    }
}
