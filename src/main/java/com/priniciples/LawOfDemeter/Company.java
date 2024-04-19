package com.priniciples.LawOfDemeter;

/**
 * @Description
 * @Author Qiu
 * @Date 2024/4/19
 */
public class Company {
    private String name;

    public Company(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}