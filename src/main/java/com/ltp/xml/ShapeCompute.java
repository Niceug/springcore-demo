package com.ltp.xml;

import com.ltp.comment.Shape;

/**
 * 相当于中间人，专用于产生Shape对象。
 */
public class ShapeCompute {
    private Shape rectangle;
    private Shape circle;

    public Shape getShape(String shapeName){
        if("rectangle".equals(shapeName))
            return rectangle;
        else if("circle".equals(shapeName))
            return circle;

        throw new RuntimeException("cannot find this class");
    }

    public void setRectangle(Shape rectangle) {
        this.rectangle = rectangle;
    }

    public void setCircle(Shape circle) {
        this.circle = circle;
    }
}
