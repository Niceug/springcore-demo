package com.ltp.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        Shape shape = (Shape)classPathXmlApplicationContext.getBean("rectangle");
        System.out.println(shape);

        Shape circle = (Shape)classPathXmlApplicationContext.getBean("circle");
        System.out.println(circle);
    }
}
