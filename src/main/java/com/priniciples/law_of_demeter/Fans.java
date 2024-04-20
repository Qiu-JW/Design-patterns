package com.priniciples.law_of_demeter;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class Fans {
    private String name;

    public Fans(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}