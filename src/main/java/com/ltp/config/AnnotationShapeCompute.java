package com.ltp.config;

import com.ltp.comment.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnnotationShapeCompute {

    @Autowired
    @Qualifier("circle")
    private Shape circle;

    @Autowired
    @Qualifier("rectangle")
    private Shape rectangle;

   public Shape compute(String shapeName) {
        if("circle".equals(shapeName)) {
            return circle;
        } else if("rectangle".equals(shapeName)) {
            return rectangle;
        }

        return null;
   }

    public void setCircle(Shape circle) {
        this.circle = circle;
    }

    public void setRectangle(Shape rectangle) {
        this.rectangle = rectangle;
    }
}
