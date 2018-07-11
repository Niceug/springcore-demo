package com.ltp.auto;

import com.ltp.comment.impl.Circle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigApplication {
    public static final Logger logger = LoggerFactory.getLogger(AnnotationConfigApplication.class);
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context-annotation.xml");



        AnnotationConfigBean annotationConfigBean =
                (AnnotationConfigBean) context.getBean("annotationConfigBean");

        AnnotationConfigBean annotationConfigBean1 =
                (AnnotationConfigBean) context.getBean("annotationConfigBean");

        logger.debug("开始打印日志，hashcode of first object = {}\n，hashcode of second object = {}",
                annotationConfigBean, annotationConfigBean1);
        // 测试Scope
        System.out.println(annotationConfigBean == annotationConfigBean1);

        Circle circle = (Circle) context.getBean("circle");
        System.out.println(circle);
    }
}
