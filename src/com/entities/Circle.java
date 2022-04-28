package com.entities;

import com.utils.Coor;

public abstract class Circle extends Shape{
    public Circle(Coor center, double radius, double z, boolean isSolid) {
        super(center, radius, z, isSolid);
    }
    public boolean isInside(Coor coor) {
        return getCenter().distance(coor) < getRadius();
    }
    public boolean isColliding(Shape shape) {
        if(shape instanceof Circle) {
            return isNear(shape);
        }else if(shape instanceof Rectangle) {
            return shape.isInside(getCenter());
        }else {

        }
    }
    public Coor calcImpact(Bullet bullet) {
        // da fare
        return null
    }
}
