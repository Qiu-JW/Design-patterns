package com.priniciples.richterSubstitution.before;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class Square extends Rectangle {
    // 正方形子类
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
}