package com.demon.consumer;

import com.demon.api.DemonApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WJ on 2018/6/8.
 */
public class Consumer {
    public static void main(String[] args) {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        DemonApi demoService = (DemonApi) context.getBean("demo"); // get remote service proxy

        while (true) {
            try {
                Thread.sleep(1000);
                String hello = demoService.getStr("world"); // call remote method
                System.out.println(hello); // get result
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }


        }

    }
}
