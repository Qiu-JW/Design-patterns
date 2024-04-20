package com.priniciples.richter_substitution.after;

import com.priniciples.richter_substitution.before.Rectangle;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class RectangleDemo {

    //  扩宽方法
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长方形的长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }

    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        //
        resize(rectangle);
        printLengthAndWidth(rectangle);

    }
}