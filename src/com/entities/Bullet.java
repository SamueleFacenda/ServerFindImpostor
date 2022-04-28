package com.entities;

import com.utils.Coor;

public class Bullet extends Entity{

    private final double directon,speed;
    private final Shape impacter;
    private final Coor impact;
    private final Person owner;

    public Bullet(Coor center, double radius, double z, double speed, double direction, Person owner, Shape impacter) {
        super(center, radius, z);
        this.speed = speed;
        this.directon = direction;
        this.owner = owner;
        this.impacter = impacter;

        impact = impacter.calcImpact(this);
    }

    public double getDirection() {
        return directon;
    }
    public double getSpeed() {
        return speed;
    }
    public void move() {
        setCenter(getCenter().move(directon, speed));
    }


}
