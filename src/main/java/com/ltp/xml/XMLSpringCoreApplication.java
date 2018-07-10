package com.ltp.xml;

import com.ltp.comment.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLSpringCoreApplication {
    public final static Logger logger = LoggerFactory.getLogger(XMLSpringCoreApplication.class);

    public static void main(String[] args) {
        logger.debug("log start");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        ShapeCompute shapeCompute = (ShapeCompute) context.getBean("shapeCompute");
        System.out.println(shapeCompute.getShape("circle"));

        Shape circle = (Shape)context.getBean("rectangle");
        System.out.println(circle);
    }
}
