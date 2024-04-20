package com.priniciples.law_of_demeter;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class Star {
    private String name;

    public Star(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}