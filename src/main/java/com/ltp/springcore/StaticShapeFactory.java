package com.ltp.springcore;

import com.ltp.comment.impl.Circle;
import com.ltp.comment.impl.Rectangle;
import com.ltp.comment.Shape;

/**
 * 静态工厂方法获取实例，省去了创建工厂对象的步骤。
 */
public class StaticShapeFactory {
    private static Shape rectangle = new Rectangle(2, 3);
    private static Shape circle = new Circle( 2);

    public static Shape getRectangle() {
        return rectangle;
    }

    public static Shape getCircle() {
        return circle;
    }
}
