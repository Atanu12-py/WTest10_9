package org.wtest;

import Mail.SendMail;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.wtest","Mail"})
public class Main {
    public static void main(String[] args) {
        SendMail mail=new SendMail();
        SpringApplication.run(Main.class,args);


    }
}