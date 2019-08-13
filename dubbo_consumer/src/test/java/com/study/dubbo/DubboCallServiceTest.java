package com.study.dubbo;

import com.study.service.IDemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboCallServiceTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("/dubbo-consumer.xml");
        ((ClassPathXmlApplicationContext) context).start();
        IDemoService demoService = (IDemoService)context.getBean("demoService");
        System.out.println(demoService.getMess());
    }
}
