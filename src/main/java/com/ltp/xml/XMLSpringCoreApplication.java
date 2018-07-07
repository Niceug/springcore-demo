package com.ltp.xml;

import com.ltp.comment.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLSpringCoreApplication {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        ShapeCompute shapeCompute = (ShapeCompute) context.getBean("shapeCompute");
        System.out.println(shapeCompute.getShape("circle"));

        Shape circle = (Shape)context.getBean("rectangle");
        System.out.println(circle);

    }
}
