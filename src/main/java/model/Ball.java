package model;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import java.awt.*;

@XmlType(name = "Ball")
public class Ball {
    private double x;
    private double y;

    private double radius;

    public Ball(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Ball() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @XmlTransient
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return new Point((int) this.x, (int) this.y);
    }
}
