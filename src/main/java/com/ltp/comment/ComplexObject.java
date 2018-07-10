package com.ltp.comment;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * 用于测试集合作为参数的情况
 */
public class ComplexObject {
    private List<Object> list;
    private Map<String, Object> map;

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "list=" + list +
                ", map=" + map +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ComplexObject complexObject = (ComplexObject) context.getBean("complexObject");

        System.out.println(complexObject);
    }
}


