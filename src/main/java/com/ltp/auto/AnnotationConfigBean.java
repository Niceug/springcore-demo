package com.ltp.auto;

import com.ltp.comment.impl.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(value = "singleton") // 三个选择：singleton, prototype, 自定义作用域
@Lazy // 用于延迟初始化（使用时才初始化，相当于XML的lazy-init = true）
public class AnnotationConfigBean {

    @Autowired
    @Qualifier("circle")
    private Circle circle;

    public Circle getCircle() {
        return circle;
    }

    @PostConstruct
    public void beforeInit() {
        System.out.println("PostConstruct用于,初始化Bean之前，调用的方法");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("销毁Bean之前");
    }
}