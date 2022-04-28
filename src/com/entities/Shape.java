package com.entities;

import com.utils.Coor;

public abstract class Shape extends Entity {
    private boolean isSolid;
    public Shape(Coor center, double radius, double z, boolean isSolid) {
        super(center, radius, z);
        this.isSolid = isSolid;
    }
    public boolean isSolid() {
        return isSolid;
    }
    public boolean isInside(Coor coor) {
        throw new UnsupportedOperationException();
    }
    public boolean isColliding(Shape shape) {
        throw new UnsupportedOperationException();
    }
    public Coor calcImpact(Bullet bullet) {
        throw new UnsupportedOperationException();
    }

}
