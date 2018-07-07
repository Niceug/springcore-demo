package com.ltp.springcore;

import com.ltp.comment.Shape;
import com.ltp.comment.impl.Circle;
import com.ltp.comment.impl.Rectangle;

/**
 * 实例工厂方法获取实例
 */
public class ShapeFactory {

    /**
     * 此处也可以使用依赖注入来实例化对象
     */
    private static Shape rectangle = new Rectangle(4, 5);
    private static Shape circle = new Circle( 8);

    public Shape getRectangle() {
        return rectangle;
    }

    public Shape getCircle() {
        return circle;
    }
}
