package com.entities;

import com.utils.Coor;

public abstract class Entity {
    private Coor center;
    private double radius,z;


    public Entity(Coor center, double radius, double z) {
        this.center = center.clone();
        this.radius = radius;
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setCenter(Coor center) {
        this.center = center.clone();
    }
    public double getX() {
        return center.getX();
    }
    public double getY() {
        return center.getY();
    }
    public Coor getCenter() {
        return center.clone();
    }
    public double getRadius() {
        return radius;
    }
    public double getZ() {
        return z;
    }
    public boolean isNear(Entity entity) {
        return center.distance(entity.center) < radius + entity.radius;
    }
}
