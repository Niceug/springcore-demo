package com.ltp.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        ShapeCompute shapeCompute = (ShapeCompute) classPathXmlApplicationContext.getBean("shapeCompute");
        System.out.println(shapeCompute.getShape("circle"));

        Shape circle = (Shape)classPathXmlApplicationContext.getBean("rectangle");
        System.out.println(circle);
    }
}
