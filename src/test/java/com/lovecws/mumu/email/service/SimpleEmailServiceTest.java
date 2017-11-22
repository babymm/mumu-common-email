package com.lovecws.mumu.email.service;

import com.lovecws.mumu.email.exception.EmailException;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/3/7.
 */
public class SimpleEmailServiceTest {

    @Test
    public void sendmessage() {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-common-email.xml");
        applicationContext.start();
        SimpleEmailService simpleEmailService=applicationContext.getBean(SimpleEmailService.class);
        try{
            boolean success = simpleEmailService.send("915827225@qq.com", null, "数据内容，你在哪里", "数据内容，你在哪里111111");
            System.out.println(success);
        }catch (EmailException e) {
            e.printStackTrace();
        }
        applicationContext.stop();
    }
}
