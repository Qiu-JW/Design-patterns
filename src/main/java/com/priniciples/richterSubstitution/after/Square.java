package com.priniciples.richterSubstitution.after;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class Square implements Quadrilateral{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    // 因为实现了接口 所以不得不有
    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
