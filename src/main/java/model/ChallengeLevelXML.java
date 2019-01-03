package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.awt.*;
import java.util.List;

@XmlRootElement(name = "Level")
public class ChallengeLevelXML {
    private String name;
    private List<Ball> ballsToPot;
    private List<Ball> motionlessBalls;
    private Ball cueBall;
    private Ball rectangleA;
    private Ball rectangleB;

    public ChallengeLevelXML(String name, List<Ball> ballsToPot, List<Ball> motionlessBalls, Ball cueBall, Ball rectangleA, Ball rectangleB) {
        this.name = name;
        this.ballsToPot = ballsToPot;
        this.motionlessBalls = motionlessBalls;
        this.cueBall = cueBall;
        this.rectangleA = rectangleA;
        this.rectangleB = rectangleB;
    }

    public ChallengeLevelXML() {
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ball> getBallsToPot() {
        return ballsToPot;
    }

    public void setBallsToPot(List<Ball> ballsToPot) {
        this.ballsToPot = ballsToPot;
    }

    @XmlElementWrapper(name = "MotionlessBalls")
    @XmlElement(name = "Ball")
    public List<Ball> getMotionlessBalls() {
        return motionlessBalls;
    }

    public void setMotionlessBalls(List<Ball> motionlessBalls) {
        this.motionlessBalls = motionlessBalls;
    }

    @XmlElement(name = "CueBall")
    public Ball getCueBall() {
        return cueBall;
    }

    public void setCueBall(Ball cueBall) {
        this.cueBall = cueBall;
    }

    @XmlElement(name = "RectangleA")
    public Ball getRectangleA() {
        return rectangleA;
    }

    public void setRectangleA(Ball rectangleA) {
        this.rectangleA = rectangleA;
    }

    @XmlElement(name = "RectangleB")
    public Ball getRectangleB() {
        return rectangleB;
    }

    public void setRectangleB(Ball rectangleB) {
        this.rectangleB = rectangleB;
    }
}
