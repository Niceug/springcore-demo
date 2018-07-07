package com.ltp.springcore;

import com.ltp.comment.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactorySpringCoreApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context-factory.xml");

        // 静态工厂方法获取实例对象
        Shape circleInstance = (Shape)context.getBean("circleInstance");
        System.out.println(circleInstance);

        // 实例工厂方法获取实例对象
        ShapeFactory shapeFactory = (ShapeFactory)context.getBean("shapeFactory");
        System.out.println(shapeFactory.getCircle());
        System.out.println(shapeFactory.getRectangle());
    }
}
