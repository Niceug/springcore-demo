package com.ltp.config;

import com.ltp.comment.impl.Circle;
import com.ltp.comment.impl.Rectangle;
import com.ltp.comment.Shape;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ltp.config")
public class AnnotationShapeApplication {

    @Bean(name = "circle")
    public Shape Circle() {
        return new Circle(5);
    }

    @Bean(name = "rectangle")
    public Shape Rectangle() {
        return new Rectangle(5, 10);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationShapeApplication.class);

        AnnotationShapeCompute compute = context.getBean(AnnotationShapeCompute.class);
        Shape circle = compute.compute("circle");
        System.out.println(circle);

        Shape rectangle = compute.compute("rectangle");
        System.out.println(rectangle);
    }
}
