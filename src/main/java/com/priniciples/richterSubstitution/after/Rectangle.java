package com.priniciples.richterSubstitution.after;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class Rectangle implements Quadrilateral{
    private double Length;
    private double Width;

    public void setLength(double length) {
        Length = length;
    }

    @Override
    public double getLength() {
        return Length;
    }

    public void setWidth(double width) {
        Width = width;
    }

    @Override
    public double getWidth() {
        return Width;
    }
}
